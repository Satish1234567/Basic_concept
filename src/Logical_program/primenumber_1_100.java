package Logical_program;

public class primenumber_1_100 {

	public static void main(String[] args) {

int flag=0;

for (int i=2;i<100;i++) {
	for(int j=2;j<i;j++) {
		if(i%j==0) {
			flag=1;
		}  
	}

if(flag==0) {
	System.out.println(i+"it is a prime number");
}
	else {
		flag=0;
	}
}
	

	}
}
