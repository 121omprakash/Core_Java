import java.util.*;
public class Student_Drive {
	public static void main(String Args[])
	{
		int id;
		String name;
		String branch;
		char gender;
		
		Scanner s = new Scanner(System.in);
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		System.out.println("Enter Student id: ");
        id = s.nextInt();
        s.nextLine(); // Consume leftover newline
        System.out.println("Enter Student name: ");
        name = s.nextLine();
        System.out.println("Enter Student gender: ");
        gender = s.next().charAt(0);
        s.nextLine(); // Consume leftover newline
        System.out.println("Enter Student branch: ");
        branch = s.nextLine();
		s1.setId(id);
		s1.setName(name);
		s1.setGender(gender);
		s1.setBranch(branch);
		
//		System.out.println("Enter Student id: ");
//        id = s.nextInt();
//        s.nextLine(); // Consume leftover newline
//        System.out.println("Enter Student name: ");
//        name = s.nextLine();
//        System.out.println("Enter Student gender: ");
//        gender = s.next().charAt(0);
//        s.nextLine(); // Consume leftover newline
//        System.out.println("Enter Student branch: ");
//        branch = s.nextLine();
//		
//		s2.setId(id);
//		s2.setName(name);
//		s2.setGender(gender);
//		s2.setBranch(branch);
//		
//		
//		
//		
//		System.out.println("Enter Student id: ");
//        id = s.nextInt();
//        s.nextLine(); // Consume leftover newline
//        System.out.println("Enter Student name: ");
//        name = s.nextLine();
//        System.out.println("Enter Student gender: ");
//        gender = s.next().charAt(0);
//        s.nextLine(); // Consume leftover newline
//        System.out.println("Enter Student branch: ");
//        branch = s.nextLine();
//		
//		s3.setId(id);
//		s3.setName(name);
//		s3.setGender(gender);
//		s3.setBranch(branch);
//		
//		
		System.out.println("Details of Student1: "+"\n"+s1.toString());
//		System.out.println("\n");
//		System.out.println("Details of Student2: "+"\n"+s2.toString());
//		System.out.println("\n");
//		System.out.println("Details of Student3: "+"\n"+s3.toString());
//		
	}
}
