//Myintegermath Class code//
package MyPackage;
import java.util.*;

class Lab1_IN_LAB_2_MyintegerMath{
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

  public static boolean isString(int x)
  {
    long sum = 0;
    while(x>0)
      {
        sum+=factorial(x%10);
        x/=10;
      }
    return (sum == x);
  }
  
