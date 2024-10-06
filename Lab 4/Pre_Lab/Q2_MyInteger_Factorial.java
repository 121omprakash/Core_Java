import java.math.BigInteger;

public class Q2_MyInteger_Factorial
{

    int value;
    Q2_MyInteger_Factorial(int a)
    {
        this.value = a;
    }
    public int getValue()
    {
        return this.value;
    }
    public boolean isEven()
    {
        return (this.value%2==0);
    }
    public boolean isOdd()
    {
        return (this.value%2!=0);
    }
    public boolean isPrime()
    {
        int i =2;
        if(this.value<2)
        {
            return false;
        }
        else{
            while(i<value)
            {
                if(value%i ==0)
                {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    public static boolean isEven(int val)
    {
        return (val%2==0);
    }
    public static boolean isOdd(int val)
    {
        return (val%2!=0);
    }

    public static boolean isPrime(int val)
    {
        int i =2;
        if(val<2)
        {
            return false;
        }
        else{
            while(i<val)
            {
                if(val%i ==0)
                {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    public static boolean isEven(Q2_MyInteger_Factorial m)
    {
        return (m.value%2==0);
    }
    public static boolean isOdd(Q2_MyInteger_Factorial m)
    {
        return (m.value%2!=0);
    }

    public static boolean isPrime(Q2_MyInteger_Factorial m)
    {
        int i =2;
        if(m.value<2)
        {
            return false;
        }
        else{
            while(i<m.value)
            {
                if(m.value%i ==0)
                {
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    //parseInt
    public static int parseInt(String str)
    {
        int res = 0;
        for(int i =0;i<str.length();i++)
        {
            int n = str.charAt(i) - '0';
            res = (res*10)+n;
        }
        return res;
    }
    public static int parseInt(char[] chr)
    {
        int res = 0;
        for(int i =0;i<chr.length;i++)
        {
            int n = chr[i] - '0';
            res = (res*10)+n;
        }
        return res;
    }
    public BigInteger factorial(int n) {
        // Initialize BigInteger to 1
        BigInteger fact = BigInteger.ONE;

        // If n is 0 or 1, return 1 (BigInteger representation)
        if (n <= 1) {
            return fact;
        }

        // Calculate factorial using BigInteger
        while (n > 1) {
            fact = fact.multiply(BigInteger.valueOf(n)); // Multiply with BigInteger
            n--;
        }

        return fact; // Return the BigInteger result
    }
}