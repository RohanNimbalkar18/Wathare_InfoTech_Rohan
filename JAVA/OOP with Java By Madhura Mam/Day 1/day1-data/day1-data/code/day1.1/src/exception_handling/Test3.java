package exception_handling;

public class Test3 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("before ....");
		//delay of 5 sec
			Thread.sleep(5000);// javac forces the handling of the CHECKED exc
		
		System.out.println("after ...");

	}

}
