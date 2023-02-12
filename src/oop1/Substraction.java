package oop1;

public class Substraction extends Addition {
	
	void sub(int a, int b) {
		int s= a-b;
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		Substraction s1 = new Substraction();
		s1.sub(90, 10);
		
		//(100+100+100)-75
		s1.add(100, 100, 100);
		int store1= s1.add(100, 100, 100);
		s1.sub(s1.add(100, 100, 100), 75);
		
		

	}

}
