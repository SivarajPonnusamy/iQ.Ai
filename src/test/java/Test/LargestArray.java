package Test;

public class LargestArray {
	public static int largest(int array[],int s) {
		int temp ;
		for(int i=0;i<s;i++) {
			for(int j=i+1;j<s;j++) {
				if (array[i]>array[j]) {
					temp =array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		return array[s-1];
		
	}
	
	
	public static void main(String args[]) {
		int a[]= {11,44,55,33,88,99,66};
		int size =a.length;
		System.out.println(size);
		int w=largest(a,size);// here largest method is returning some value which needs to capture and store in w variable.
		System.out.println(w);
		//System.out.println(largest(a,size));
		
		
	}

}
