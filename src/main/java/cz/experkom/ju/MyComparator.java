package cz.experkom.ju;

import java.util.Comparator;

public class MyComparator implements Comparator<String>{
	public int compare(String o1, String o2) {
		String o1bez, o2bez;
		o1bez=o1.replace("text", "").replace("x", "");
		o2bez=o2.replace("text", "").replace("x", "");
		Integer i1= Integer.valueOf(o1bez);
		Integer i2= Integer.valueOf(o2bez);
		int compareTo = i2.compareTo(i1);
		return compareTo;
		//return o1.compareTo(o2);- také by to šlo
	}

}
