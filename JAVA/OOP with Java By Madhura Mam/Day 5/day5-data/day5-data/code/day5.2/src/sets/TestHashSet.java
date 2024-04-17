package sets;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<Double> hs = new HashSet<>();// size=0, initCapa=16,L.F =0.75F
		double[] doubles = { 2, 3, 12, 3, 56, 2, 10, -10.56, 12, 34.6, 7.89, 2,10 };
		// populate HS using array data
		for (double d : doubles)
			System.out.println("Added " + hs.add(d));// auto boxing , double --> Double (Double.valueOf(double)
		System.out.println("HS contents via toString"+hs);
		System.out.println("HS contains 10 "+hs.contains(10));//int --> Integer -->XXXX---> Double
		System.out.println("HS contains 10.0 "+hs.contains(10.0));
		System.out.println("remove 10"+hs.remove(10.0));
		System.out.println("Set again "+hs);
	}

}
