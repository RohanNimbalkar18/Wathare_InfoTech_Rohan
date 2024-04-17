package lambda_expressions;

import static utils.ShopUtils.populateProductList;

import java.util.Collections;
import java.util.List;

import com.shop.core.Product;

public class Test4 {

	public static void main(String[] args) {
		// get product list from utils
		List<Product> productList = populateProductList();
		productList.forEach(p -> System.out.println(p));
		// display the products sorted as per manu.date
		// higher order method : due to 2nd arg
		// Collections.sort(List<T> list,Comparator<? super T> comp)
		// Comparator : func i/f
		// SAM : public int compare(T o1,T o2)
		Collections.sort(productList, (p1, p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate()));
		System.out.println("sorted products as per date");
		productList.forEach(p -> System.out.println(p));
		
	}

}
