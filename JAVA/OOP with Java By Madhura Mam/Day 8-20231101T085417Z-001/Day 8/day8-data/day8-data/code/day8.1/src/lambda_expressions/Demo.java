package lambda_expressions;
import static utils.ShopUtils.populateProductList;
import static utils.ShopUtils.populateProductMap;

import com.shop.core.*;

import java.util.Map;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try(Scanner sc = new Scanner(System.in))
    {
    	 Map<Integer,Product>productMap= populateProductMap( populateProductList());
    	 Category ct = Category.BREAD;
    	 double dicount=10;
    	 productMap.values()
    	 .stream()
    	 .filter(p->p.getProductCategory()==ct)
    	 .forEach(p->{p.setPrice(p.getPrice()-discount}));
    	 
    	 
    }
	}

}
