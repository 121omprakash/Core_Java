import java.math.*;
import java.util.*;
class MyPoint{
	double x;
	double y;
	MyPoint()
	{
		this.x = 0;
		this.y = 0;
	}
	
	MyPoint(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	//getter
	double getX()
	{
		return this.x;
	}
	double getY()
	{
		return this.y;
	}
	//distance
	double getDistannce(double x2,double y2)
	{
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
	}
}
public class Q2_MyPoint {
	public static void main(String [] Args)
	{
		double x1,y1,x2,y2;
		System.out.println("Enter the data point (x1,y1)");
		Scanner s = new Scanner(System.in);
		x1 = s.nextInt();
		y1 = s.nextInt();
		System.out.println("Enter the data point (x2,y2)");
		x2 = s.nextInt();
		y2 = s.nextInt();
		MyPoint p1 = new MyPoint(x1,y1);
//		MyPoint p2 = new MyPoint(x2,y2);
		System.out.println("Distance btw p1 and p2: "+p1.getDistannce(x2, y2));
	}
	
}
