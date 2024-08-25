/* Problem Statement: Develop java code with 3 methods in myfirsyclass 
    a) Factorial() 
    b) isStrong()
*/

import java.util.Scanner;
public class Lab1_IN_Lab_1{
  //method to find factorial which takes an integer x as argument and return long.
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
//method to find whether given number is strong or not which takes an integer x as argument and return boolean value.
  public static boolean isStrong(int x)
  {
    int total = 0;
    while(x>0)
      {
        total+= factorial(x%10);
        x/=10;
      }
    return (total==x);
  }
  //Main method//

  public static void main(String Args[])
  {
    int n;
    System.out.println("Enter a number: ");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    System.out.println("Factorial of "+n+" = "+factorial(n));
    if(isStrong(n))
    {
      System.out.println(n+" is Strong number");
    }
    else
    {
      System.out.println(n+" is not strong number");
    }
    
  }
}
