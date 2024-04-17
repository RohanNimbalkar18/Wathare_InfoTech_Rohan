package lambda_expressions;

import static utils.ShopUtils.populateProductList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.shop.core.Product;

public class Test5 {

	public static void main(String[] args) {
		String s="abcd";//literal string
		Integer i=12345;//integer literal
		try(Scanner sc = new Scanner(System.in))
		// get product list from utils
		List<Product> productList = populateProductList();
		productList.forEach(p -> System.out.println(p));
		// display the products sorted as per manu.date
		// higher order method : due to 2nd arg
		// Collections.sort(List<T> list,Comparator<? super T> comp)
		// Comparator : func i/f
		// SAM : public int compare(T o1,T o2)
		//Function literal => assigning func def to a variable !
		Comparator<Product> comp=(p1, p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate());
		Collections.sort(productList,comp);
		System.out.println("sorted products as per date");
		productList.forEach(p -> System.out.println(p));
		.filter(p -> p.getProductCategory()==cat)
		.filter(p -> p.getprice()>price)
		.map(p -> p.getName())
		.foreach(name ->System.out.println(name));
		
		
	}

}
