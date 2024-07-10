package Test;

public class Reverse_string {
	
	public static void main(String args[]) {
		String company ="iQuantm";
		int size =company.length();
		String reverse = " ";
		for(int i=1;i<size;i++) {
		char ch	=company.charAt(i);
			reverse = ch+reverse;//Qi
		}
		System.out.println(reverse);
	}

}
