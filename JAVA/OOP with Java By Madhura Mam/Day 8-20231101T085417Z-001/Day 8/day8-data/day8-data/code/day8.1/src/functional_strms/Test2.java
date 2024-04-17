package functional_strms;
import static utils.ShopUtils.*;

import java.util.Map;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test2 {

	public static void main(String[] args) {
		// get prduct map from utils n display it
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		productMap.forEach((k,v) -> System.out.println(v));
		Category category=Category.FRUITS;
		//accept product category from user  n 
		//display products of the specified category
		System.out.println("Products of the category "+category);
		productMap.values() //Collection<Product>
		.stream() //Stream<Product> : all
		.filter(p -> p.getProductCategory()==category) //filtered Stream<Product>
		.forEach(p -> System.out.println(p));
	}

}
