package Test;

public class Swap {
	public static void main(String args[]) {
		int a = 45;
		int b = 100;
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println(a + " " + b);

		int x = 10;
		int y = 5;
		//x = x * y;//50
		//y = x / y;//10
		//x = x / y;//5
		
		x=x+y;
		y=x-y; 
		x=x-y;
		
		System.out.println(x + " " + y);

	}

}
