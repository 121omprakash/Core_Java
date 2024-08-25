
public class Factorial {
	public static void main(String Args[])
	{
		int x;
		if(Args.length ==1)
		{
			x = Integer.parseInt(Args[0]);
			System.out.println("Factorial of "+x+" = "+factorial(x));
		}
		else
		{
			System.out.println("Enter only one argument during execution");
		}
	}
	public static long factorial(int x)
	{
		long fact = 1;
		while(x>0)
		{
			fact*=x;
			x--;
		}
		return fact;
	}
}
