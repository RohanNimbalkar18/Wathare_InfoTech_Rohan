package lambda_expressions;
import static utils.ShopUtils.populateProductList;

import java.util.List;

import com.shop.core.Product;
public class Test1 {

	public static void main(String[] args) {
		// get product list from utils 
		List<Product> productList = populateProductList();
		//display it : FP (declarative style)
		//higher order func : forEach : Iterable
		//arg of forEach : Consumer<? super T>
		//Consumer : func i/f ---> replace by a lambda : YESS
		//SAM : public void accept(T o)
		productList.forEach(p -> System.out.println(p));

	}

}
