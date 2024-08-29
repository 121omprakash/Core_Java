package equation;
import java.lang.Math;

public class Quadratic_Equation {
	private int a;
	private int b;
	private int c;
	
	public int getA()
	{
		return this.a;
	}
	public int getB()
	{
		return this.b;
	}
	public int getC()
	{
		return this.c;
	}
	public boolean setA(int a)
	{
		this.a = a;
		return true;
	}
	public boolean setB(int b)
	{
		this.b = b;
		return true;
	}
	public boolean setC(int c)
	{
		this.c = c;
		return true;
	}
	
	public int getDiscriminant()
	{
		int d;
		d = ((b*b)-(4*a*c));
		return d;
	}
	
	public double getRoot1()
	{
		double x;
		x = ((-b+Math.sqrt(getDiscriminant()))/(2*a));
		return x;
	}
	public double getRoot2()
	{
		double y;
		y = ((-b-Math.sqrt(getDiscriminant()))/(2*a));
		return y;
	}
	
	public String toString()
	{
		String s;
		if(b<0)
		{
			s = "Equation: "+a+"x²"+b+"x+"+c+"\nDiscriminant: "+getDiscriminant()+"\nRoot1: "+getRoot1()+"\nRoot 2:"+getRoot2();
		}
		else {
			s = "Equation: "+a+"x²+"+b+"x+"+c+"\nDiscriminant: "+getDiscriminant()+"\nRoot1: "+getRoot1()+"\nRoot 2:"+getRoot2();
		}
		return s;
	}
}
