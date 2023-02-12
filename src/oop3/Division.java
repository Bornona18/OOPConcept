package oop3;

import oop1.Addition;

public class Division extends Addition{
	
	int x;
	int y;
	
	//constructor
	
	}
	
	
	void divide() {
		double d =x/y;
		System.out.println(d);
	}
	void divide(int a, int b, int c) {
		double d =(a+b)/c;
		System.out.println(d);
	}
	void divide(double a, double b) {
		double d =a/b;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		Division d1= new Division();
		//And perform (100+ 100+ 50)/ 10;
		double div2 = d1.add(100.0, 100.0, 50.0);
		d1.divide(div2, 10.0);
				

	}

}