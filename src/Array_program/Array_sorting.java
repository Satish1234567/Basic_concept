package Array_program;

import java.util.Arrays;

public class Array_sorting {
public static void main (String [] args) {
	int temp;
	int a[]= {12,234,2345345,62345,456,2345,345};
	System.out.println(Arrays.toString(a));
	int n=a.length;
	for (int i=0;i<n-1;i++) {
		for(int j=0;j<n-1;j++) {
			if(a[j]>a[j+1]) {
				  temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
}
	                System.out.println(Arrays.toString(a));
}
}
