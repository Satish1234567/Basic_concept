package Logical_program;

public class primenumber {
	public static void main(String[] args) {
		int a=121;
		int flag=0;
		for(int i=2;i<=a-1;i++) { //2<=120;
			if(a%i==0) {    //120/2=0;
				flag=1;
			}
		}
		
	if(flag==0) {
		System.out.println(a+"it is a prime number");
	}
	else {
	     System.out.println(a+"it is not a prime number");
	}
}
}