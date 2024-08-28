package MyPackage;

import java.util.*;
public class Sorting_Main {
	public static void main(String Args[])
	{

		Scanner s = new Scanner(System.in);
		int size;
		int arr[];
		System.out.println("Enter the size of array: ");
		size = s.nextInt();
		
		arr = new int[size];
		
		System.out.println("Enter the element of the array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = s.nextInt();
		}
		Sorting_Searching a;
		a = new Sorting_Searching();
		a.setSize(size);
		a.setArr(arr);
		String opt = "1.Linear Search\n2.Binary Search\n3.Bubble Sort\n4.Print Array\n5.Exit";
		while(true) {
			System.out.println("Enter an option to perfrom below operation: ");
			System.out.println(opt);
			int input;
			input= s.nextInt();
			if(input == 1)
			{
				System.out.println("Enter the key to find in array: ");
				int k =s.nextInt();
				System.out.println("Key is at Position: "+a.linear(k));
			}
			else if(input ==2)
			{
				System.out.println("Enter the key to find in array: ");
				int k = s.nextInt();
				System.out.println("Key is at Position: "+a.binarySearch(k));
			}
			else if(input==3)
			{
				a.bubbleSort();
				System.out.println("Array after bubble sort: \n");
				a.printArray();
			}
			else if(input ==4)
			{
				System.out.println("Elements of array are: ");
				a.printArray();
			}
			else if(input ==5)
			{
				System.out.println("Exited");
				break;
				
			}
		}
		
		
	}
}
