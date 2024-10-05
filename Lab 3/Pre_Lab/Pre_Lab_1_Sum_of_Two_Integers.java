import java.io.file;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pre_Lab_1_Sum_of_Two_Integers
{
    public static void main(String Args[])
    {
        File f = new File("Int.txt");
        Scanner s = new Scanner(f);
        int sum =0;
        while(s.hasNextInt())
        {
            sum+=s.nextInt();
        }
        System.out.println("Sum: "+sum);
    }
}