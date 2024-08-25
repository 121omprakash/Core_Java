import java.util.Scanner;
public class Array_Of_Object {
	public static void main(String Args[])
	{
		Student s[];
		
		int n ;
		Scanner i = new Scanner(System.in);
		System.out.println("Enter the number of Students: ");
		n = i.nextInt();
		s = new Student[n];
		for(int j =0;j<n;j++)
		{
			s[j] = new Student();
			System.out.println("Enter the Details of Student "+(j+1));
			i.nextLine();
			System.out.println("Enter Name : ");
			s[j].setName(i.nextLine());
			
			System.out.println("Enter ID : ");
			s[j].setId(i.nextInt());
			
			System.out.println("Enter Gender : ");
			s[j].setGender(i.next().charAt(0));
//			i.next();
			System.out.println("Enter Branch : ");
			s[j].setBranch(i.next());
//			i.next();
		}
		int count;
		count =1;
		for(Student a : s)
		{
			System.out.println("Details of Student "+count);
			count++;
			System.out.println(a);
		}
	}
}
