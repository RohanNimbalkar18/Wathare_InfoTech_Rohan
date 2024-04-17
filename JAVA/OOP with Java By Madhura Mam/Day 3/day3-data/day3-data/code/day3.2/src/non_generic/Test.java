package non_generic;

public class Test {

	public static void main(String[] args) {
		// create a Holder cls instance to hold : 12345
		Holder intHolder = new Holder(12345);// auto boxing --up casting
		System.out.println(intHolder.getClass());// non_generic.Holder
		System.out.println(intHolder.getRef().getClass());// java.lang.Integer
		int data = (Integer) intHolder.getRef();// expl : down casting , impl : auto un boxing
		// create a Holder cls instance to hold : "hello"
		Holder stringHolder = new Holder("hello");// up casting
		System.out.println(stringHolder.getClass()); //Holder
		System.out.println(stringHolder.getRef().getClass());//java.lang.String
		String s=(String)stringHolder.getRef();
		intHolder=stringHolder;//no err !
		data = (Integer) intHolder.getRef();//run time err : classcast exc : can't cast String to Integer
		System.out.println(data);
	}

}
