import java.util.*;
public class Arithmatic{
	public static void main(String[] Args)
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of a:");
		a = s.nextInt();
		System.out.print("Enter the value of b:");
		b = s.nextInt();
		System.out.printf("Sum of a and b: %d",a+b);
		System.out.printf("Subtraction of a and b: %d",a-b);
		System.out.printf("Multiplication of a and b %d",a*b);
	}
}