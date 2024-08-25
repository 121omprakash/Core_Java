class Calculator{
	//instance variable
	int num1;
	//Static Variable
	static int a=10;
	public static void main(String Args[])
	{
		System.out.println("Main Method");
		int ans = sum(10,20);
		System.out.println("Sum: "+ans);
		Calculator c1 = new Calculator();
		System.out.println("value of num1:"+ c1.num1);
	}
	static int sum(int a ,int b)
	{
		return a+b;
	}
	static{
		System.out.println("Static block executed");
	}
	static{
		System.out.println("Static Block 2 executed");
	}
	{
		System.out.println("Instance Block Executed");
	}
	{
		System.out.println("instance block 2 executed");
	}
}