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
    public static bool isStrong(int x)
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
}