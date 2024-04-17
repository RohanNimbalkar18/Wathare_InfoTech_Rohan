package date_handling;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
	}

	public Person(String name, Date dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" +sdf.format(dob) + "]";
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

}
