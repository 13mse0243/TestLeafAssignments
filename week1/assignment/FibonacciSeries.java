package week1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int n1=0,n2=1,n3;
		System.out.println("Fibonacci series are: ");
		System.out.print(n1+" "+n2);
		for(int i=0;i<n;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
