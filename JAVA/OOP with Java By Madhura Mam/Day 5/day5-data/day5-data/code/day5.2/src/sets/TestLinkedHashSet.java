package sets;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Double> hs = new LinkedHashSet<>();// size=0, initCapa=16,L.F =0.75F
		double[] doubles = { 2, 3, 12, 3, 56, 2, 10, -10.56, 12, 34.6, 7.89, 2,10 };
		// populate HS using array data
		for (double d : doubles)
			System.out.println("Added " + hs.add(d));// auto boxing , double --> Double (Double.valueOf(double)
		System.out.println("LHS contents via toString"+hs);
	
	}

}
