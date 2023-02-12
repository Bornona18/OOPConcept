package oop1;

public class Addition {
	
	private int x;
	private int y;// Global/instance variable
	
	

	void add()	{
		int sum = x+y;
		System.out.println(sum);
	}

	public int add(int a, int b, int c){
		int sum = a+b+c;
		return sum;
	}
	
	protected double add(double a, double b, double c){
		double sum = a+b+c;
		return sum;
	}
	
	
	public static void main(String[] args) {
		
        //Object Creation - with a new keyword
		//DRY - Do Not repeat yourself
		
		Addition a1 = new Addition();
		
	
		a1.x=5;
		a1.y=7;
		System.out.println(a1.x+a1.y);
		//a1.add(); 
		int sum3 = a1.add(7, 9, 3);
		System.out.println(sum3);
		
		double sum2 =a1.add(2.0, 9.0, 2.7);
		System.out.println(sum2);
		
		Addition a2 = new Addition();
		a2.x=7;
		
		Addition a3 = new Addition();
		a3.x=56;
		a3.y=78;
		a3.add();
		double print = a3.add(10.3, 10.6, 9.3);
		int store = a3.add(7, 7, 9);
		System.out.println(print);
		System.out.println(a3.add(7, 7, 9));
		System.out.println(store);
		
		
		
		
	}
	
	

}
