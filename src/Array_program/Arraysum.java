 package Array_program;

import java.util.Arrays;

public class Arraysum {
public static void main (String [] args) {
	int a[]= {12,12,234,34,34,13,13,534,654734};
	int sum=0;
	int num=12;
	int temp=0;
	int count=0;
	/*for (int i=0;i<=a.length-1;i++) {
		sum=sum+a[i];
		if(num==a[i])
		{
			count++;
		}
	}
	System.out.println(sum/a.length);
	System.out.println("count of number " + num+" "+ count);
}
}
*/
	for (int i=0;i<a.length-1;i++) {
		for (int j=i+1;j<a.length-1;j++) {
			if (a[i]==a[j]) {
				temp=a[i];
				
				System.out.println(temp);
				//continue;
			}
		}
	}
	// System.out.println(temp);
}
}
	