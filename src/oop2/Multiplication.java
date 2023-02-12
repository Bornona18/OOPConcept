package oop2;

import oop1.Addition;

public class Multiplication extends Addition{
	
	void multilpe(int a, int b){
		int m = a*b;
		System.out.println(m);
	}
	
    void multilpe(double a, double b){
		double m =a*b;
		System.out.println(m);
	}

	public static void main(String[] args) {
		Multiplication m1 = new Multiplication();
		m1.multilpe(4, 6);
		m1.multilpe(9.3, 7.9);
		
		//(100+100+1000)*10
		
		m1.add(100, 100, 100);
		int sum6 = m1.add(100, 100, 100);
		m1.multilpe(sum6, 10);
		m1.add(6.8, 9.3, 9.0);
		
		//Create a new class in the oop2 named it Division
		//And perform (100+ 100+ 50)/ 10;
	
	
	}

}
