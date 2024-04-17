package sets;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet2 {

	public static void main(String[] args) {

		double[] doubles = { 2, 3, 12, 3, 56, 2, 10, -10.56, 12, 34.6, 7.89, 2, 10 };
		TreeSet<Double> ts=new TreeSet<>(new Comparator<Double>() {
			@Override
			public int compare(Double d1,Double d2)
			{
				return d2.compareTo(d1);
			}
		});
		System.out.println(ts);//[]
		for(double d : doubles)
			ts.add(d);
		System.out.println(ts);//desc order of data

	}

}
