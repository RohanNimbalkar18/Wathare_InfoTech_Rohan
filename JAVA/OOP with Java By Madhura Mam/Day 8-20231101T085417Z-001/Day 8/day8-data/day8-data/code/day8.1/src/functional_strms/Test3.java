package functional_strms;

import static utils.ShopUtils.*;

import java.util.Map;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test3 {

	public static void main(String[] args) {
		// get prduct map from utils n display it
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		productMap.forEach((k, v) -> System.out.println(v));
		Category category = Category.GRAIN;
		// accept product category from user n
		// display least expensive product from specified category
		Product product = productMap.values()
		.stream()
		.filter(p -> p.getProductCategory()==category)
		.min((p1,p2)->((Double)p1.getPrice()).compareTo(p2.getPrice()))
		.orElseThrow();
		System.out.println("least exepensive product "+product);

	}

}
