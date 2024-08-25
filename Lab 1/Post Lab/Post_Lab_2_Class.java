package Mymathematics;
import java.util.*;

class MyIntegerMath{
    public static void factorial(int  x)
    {
        long fact = 1;
        while(x>0)
        {
            fact*=x;
            x--;
        }
        return fact;
    }
    public static boolean isStrong(int x)
    {
        long sum = 0;
        while(x>0)
        {
            sum+=factorial(x%10);
            x/=10;
        }
        return (sum==x);
    }
    public static int CountDigits(int x)
    {
        int count = 0;
        while(x>0)
        {
            count++;
            x/=10;
        }
        return count;
    }
    public static boolean isArmstrong(int x)
    {
        int digit = CountDigits(x);
        int sum =0;
        while(x>0)
        {
            sum+=pow(x%10,digit);
            x/=10;
        }
        return (sum==x);
    }

    //main class
    public static void main(String [] Args)
    {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        x = sc.nextInt();

        //Factorial
        System.out.println("Factorial of "+x+" ="+factorial(x));

        //isStrong
        if(isStrong(x))
        {
            System.out.println(x+" is a strong number");
        }
        else
        {
            System.out.println(x+" is not strong number");
        }

        //countDigit
        System.out.println("There are "+CountDigits(x)+ " in "+X);

        //isArmstrong
        if(isArmstrong(x))
        {
            System.out.println(x+" is an armstrong number");
    
        }
        else{
            System.out.println(x+" is not an armstrong number");
        }
    }
}