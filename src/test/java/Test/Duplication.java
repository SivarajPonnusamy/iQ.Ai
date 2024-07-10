package Test;

public class Duplication {

	public static void main(String args[]) {
		String s = "Great responsibility";
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			// char ch =s.charAt(i);
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[i]);

				}
			}

		}

	}

}


