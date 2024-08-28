package MyPackage;

public class Sorting_Searching {
	private int s;
	private int arr[];
	//
	boolean setSize(int s)
	{
		this.s = s;
		arr = new int[s];
		return true;
	}
	boolean setArr(int arr[])
	{
		this.arr =arr;
		return true;
	}
	//
	public int linear(int key)
	{
		for(int i =0;i<s;i++)
		{
			if(arr[i] == key)
			{
				return (i+1);
			}
		}
		System.out.println(key+" is not in array.");
		return -1;
	}
	//bubble sort
	public void bubbleSort()
	{
		int size = arr.length;
	    for (int i = 0; i < size - 1; i++)
	    {
	      for (int j = 0; j < size - i - 1; j++)
	      {
		        if (arr[j] > arr[j + 1]) 
		        {
		          int temp = arr[j];
		          arr[j] = arr[j + 1];
		          arr[j + 1] = temp;
		        }
	      }
	    }
	}
	//binary search
	public int binarySearch(int key)
	{
		int l,r;
		l =0;
		r = arr.length-1;
		while(l<=r)
		{
			int m = (l+r)/2;
			if(arr[m] == key)
			{
				return m+1;
			}
			if(arr[m]<key)
			{
				l = m+1;
			}
			else
			{
				r = m-1;
			}
		}
		return -1;
	}
	//method to print the array
	public void printArray()
	{
		System.out.println("Elements of arrays are: ");
		for(int i : arr)
		{
			System.out.println(i);
		}
	}
}
