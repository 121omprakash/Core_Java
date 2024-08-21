//Problem: Modularizing to class level of in lab q1
import java.util.Scanner;
public class Lab1_IN_LAB_2_MyDemo{
  public static void main(String Args[])
  {
    System.out.println("Enter a number: ");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    System.out.println("Factorial of "+n+" = "+ MyintegerMath.factorial(n));
    if(MyintegerMath.isStrong(n))
    {
      System.out.println(n+" is Strong number");
    }
    else
    {
      System.out.println(n+ " is not a strong number");
    }
  }
