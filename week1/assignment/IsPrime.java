package week1.assignment;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		int prime=0;
		if(n<=1)
		{
			System.out.println(n+" is not a prime number");
		}
		else
		{
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
			{
				System.out.println(n+" is not a prime number");
				prime=1;
				break;
			}
		}
		if(prime==0)
		{
			System.out.println(n+" is a prime number");
		}
		}
	}

}
