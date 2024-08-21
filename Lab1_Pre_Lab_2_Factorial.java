//Problem Statement: Write a java program to compute the factorial of a number in main method.//
import java.util.*;
public class Lab1_Pre_Lab_2{
	public static void main(String[] Args)
	{
		int a;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of a:");
		a = s.nextInt();
		int fact = 1;
		while(a>0)
			{
				fact*=a;
				a--;
			}
		System.out.println("Factorial of "+a +" ="+fact);
		
	}
	
}
