package functional_strms;

import static utils.ShopUtils.*;

import java.util.Map;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test4 {

	public static void main(String[] args) {
		// get prduct map from utils n display it
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		productMap.forEach((k, v) -> System.out.println(v));
		Category category = Category.OIL;
		//display sum of all the products from the specified category
		double sum=productMap.values()
		.stream() //Stream<Product>
		.filter(p -> p.getProductCategory()==category) //filtered Stream<Product>
		.mapToDouble(p -> p.getPrice()) //DoubleStream
		.sum();
		System.out.println(sum);
	}

}
