
public class Sum_Avg {
	public static void main(String Args[])
	{
		int sum = 0;
		int len = Args.length;
		for(int i =0;i<Args.length;i++)
		{
			sum+=Integer.parseInt(Args[i]);
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+(sum/len));
	}
}
