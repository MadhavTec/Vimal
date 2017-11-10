package com.pack.two;

public class FindTheWinner {

public static void main(String[] args) {
	int a[]={1,2,3};
	int m[]={2,1,3};
	System.out.println(qn(a,m,"even"));
}

	static String qn(int[] a, int[] m, String odev) {
		String ret;
		int i = 0;
		int ap = 0;
		int mp = 0;
		if (odev.equalsIgnoreCase("odd"))
			i = 1;
		for (; i < a.length; i += 2) {
			if (i + 2 > a.length)
				break;
			ap += a[i] - m[i];
			mp += m[i] - a[i];
		}
		if (ap > mp) {
			return "Andrew";
		} else {
			return "Maria";
		}
	}
}
