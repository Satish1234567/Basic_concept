package Array_program;

import java.util.Arrays;

public class Array_sorting_2 {
public static void main(String [] args) {
	/*int a[]= {12,23,345,21,234,1234,32,45};
	int temp;
	for(int i=0;i<a.length;i++) {
		for(int j=i;j<a.length;j++) {
			if(a[i]>a[j]) {
				
				temp=a[i];//
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	//for(int b:a) {
		//System.out.println(a);
		System.out.println(Arrays.toString(a));
	}
}

*/
	
	int a[] = {12,342534,465,234,456,233,34,34,1234};
	int temp;
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	/*
	for (int i=0;i<a.length;i++) {
		for (int j=i+1;j<a.length;j++) {
			if ( a[i] >a[j]) {
				temp=a[i];
				a[j]=a[i];
				a[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
	*/
}
}
	
	
	
	
	
	
	
	
	
	
	