package Test;

public class Swap_sort {
	public static void main(String args[]) {

		int a[] = new int[45];
		a[0] = 1;
		a[2] = 2;
		int a1[] = { 1, 2, 4, 56, 7 };
		int size = a1.length;
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a1[i] < a1[j]) {
					int temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}
		for (int sort : a1) {
			System.out.print(" "+sort);
		}
	}
}
