package equation;
import java.util.*;
public class Equation_Drive {
	public static void main(String Args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of \na\nb\nc: ");
		int a,b,c;
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		Quadratic_Equation q = new Quadratic_Equation();
		q.setA(a);
		q.setB(b);
		q.setC(c);
		System.out.println(q.toString());
	}
	
}
