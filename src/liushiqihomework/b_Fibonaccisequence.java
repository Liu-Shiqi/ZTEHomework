package liushiqihomework;

public class b_Fibonaccisequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=1,c=0;
		System.out.print(a+" "+b+" ");
		while(c<=100) {
			c=a+b;
			if(c<=100) {
				System.out.print(c+" ");
			}
			a=b;
			b=c;
		}
		
		


	}

}
