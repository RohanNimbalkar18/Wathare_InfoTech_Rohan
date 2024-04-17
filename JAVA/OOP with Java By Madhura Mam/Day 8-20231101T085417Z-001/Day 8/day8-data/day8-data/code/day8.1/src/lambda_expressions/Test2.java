package lambda_expressions;

import static utils.ShopUtils.populateProductList;

import java.util.List;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test2 {

	public static void main(String[] args) {
		// get product list from utils
		List<Product> productList = populateProductList();
		System.out.println("Products in the shop :");
		productList.forEach(p -> System.out.println(p));
		//remove all the products from the specified category
		Category cat=Category.BREAD;
		//higher order func of Collection i/f 
		//public default boolean removeIf(Predicate<? super T> filter)
		//SAM : public boolean test(T o)
		productList.removeIf(p -> p.getProductCategory()==cat);
		System.out.println("Products in the shop after :");
		productList.forEach(p -> System.out.println(p));
		//remove all the products with price > 100
		productList.removeIf(product -> product.getPrice()> 100);
		System.out.println("Products in the shop after :");
		productList.forEach(p -> System.out.println(p));
	

	}

}
