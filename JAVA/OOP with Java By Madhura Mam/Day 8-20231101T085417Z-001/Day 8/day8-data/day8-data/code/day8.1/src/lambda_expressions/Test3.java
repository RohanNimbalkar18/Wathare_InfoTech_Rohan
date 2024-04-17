package lambda_expressions;
import static utils.ShopUtils.*;

import java.util.Map;

import com.shop.core.Product;

public class Test3 {

	public static void main(String[] args) {
		// get map of products from utils
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		//display k n v
		//Map API : public void forEach(BiConsumer<? super K,? super V> action)
		//java.util.function.BiConsumer : Func i.f
		//SAM : public void accept(K k,V v)
		System.out.println("products in the map");
		productMap.forEach((k,v) -> System.out.println("PID "+k+" : "+v));
		//increase all product prices by 10
		productMap.forEach((pid,prod) -> prod.setPrice(prod.getPrice()+10));
		System.out.println("products in the map again ");
		productMap.forEach((k,v) -> System.out.println("PID "+k+" : "+v));
		

	}

}
