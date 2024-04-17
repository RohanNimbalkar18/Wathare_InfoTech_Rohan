package sets;

import java.util.TreeSet;

public class TestTreeSet1 {

	public static void main(String[] args) {
		TreeSet<Double> hs = new TreeSet<>();// size=0, initCapa=16,L.F =0.75F
		double[] doubles = { 2, 3, 12, 3, 56, 2, 10, -10.56, 12, 34.6, 7.89, 2,10 };
		// populate HS using array data
		for (double d : doubles)
			System.out.println("Added " + hs.add(d));// auto boxing , double --> Double (Double.valueOf(double)
		System.out.println("TS contents via toString"+hs);
	
	}

}
