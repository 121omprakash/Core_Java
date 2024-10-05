import java.util.*;

public class Post_Lab_1_Array{
    public static void main(String Args[])
    {
        double bes, avg, worst;
        int [] arr;
        arr = new int[100000];
        Random random = new Random();
        int count = 0;
        double arr_start = System.currentTimeMillis();
        for(int i =0;i<100000;i++)
        {
            arr[i] = random.nextInt(100000);
        }
        double arr_end = System.currentTimeMillis();
        int best_key = arr[0];
        int avg_key = arr[50000];
        int worst_key = arr[99999];

        for(int i =0;i<100000;i++)
        {
            if(arr[i] == best_key)
            {
                best = System.currentTimeMillis();
                break;
            }
            if(arr[i] == avg_key)
            {
                avg = System.currentTimeMillis();
            }
            if(arr[i] == worst_key)
            {
                worst = System.currentTimeMillis();
            }
        }
        System.out.println("Array Creation Time: "+(arr_end - arr_start));
        System.out.println("Best Case Searching Time: ",+(best-arr_end));
        System.out.println("Avg Case Searching Time: ",+(avg-arr_end));
        System.out.println("Worst Case Searching Time: ",+(worst-arr_end));
    }
}