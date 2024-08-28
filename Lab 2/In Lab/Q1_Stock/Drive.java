package MyDrive;
import MyStock.Stock;
import java.util.Scanner;

public class Drive{
	public static void main(String Args[])
	{
		Stock a = new Stock();
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the Symbol of Stock: ");
		a.SetSymbol(s.next().charAt(0));
		System.out.println("Enter the Stock name: ");
		a.setName(s.next());
		System.out.println("Enter the Previous Closing Price: ");
		a.setPreviousClosingPrice(s.nextDouble());
		System.out.println("Enter the Current price of the Stock: ");
		a.setCurrentPrice(s.nextDouble());
		
		System.out.println("Details of Stock :\n"+a.toString());
	}
}