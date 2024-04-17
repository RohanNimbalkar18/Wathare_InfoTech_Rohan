package generic;

public class Test {

	public static void main(String[] args) {
		// create a Holder cls instance to hold : 12345
		Holder<Integer> intHolder = new Holder<>(12345);// int --> Integer : auto boxing
		int data = intHolder.getRef();// auto un boxing
		// create a Holder cls instance to hold : "hello"
		Holder<String> stringHolder = new Holder<>("hello");// No impl conversion !
		String s = stringHolder.getRef();// no need of down casting!
//		intHolder = stringHolder;// javac err : incompatible types !Holder<String> is NOT compatible with
									// Holder<Integer>
		System.out.println(intHolder.getClass());//generic.Holder
		System.out.println(stringHolder.getClass());//generic.Holder
		System.out.println(intHolder.getRef().getClass());//Integer
		System.out.println(stringHolder.getRef().getClass());//String
	}

}
