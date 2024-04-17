package lambda_expressions;
import static utils.ShopUtils.populateProductList;
import static utils.ShopUtils.populateProductMap;

import com.shop.core.*;

import java.util.Map;
import java.util.Scanner;


public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try(Scanner sc = new Scanner(System.in))
    {
    	 Map<Integer,Product>productMap= populateProductMap( populateProductList());
    	 double avg = InStream.of(10,20,30,40)
    			   .filter(i-> i>40)


}
}