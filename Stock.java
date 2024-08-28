package MyStock;

public class Stock {
	private char Symbol;
	private String Name;
	private double previousClosingPrice;
	private double currentPrice;
	
	//method
	public boolean SetSymbol(char s)
	{
		this.Symbol = s;
		return true;
	}
	
	public boolean setName(String name)
	{
		this.Name = name;
		return true;
	}
	//
	public boolean setPreviousClosingPrice(double p)
	{
		this.previousClosingPrice = p;
		return true;
	}
	//
	public boolean setCurrentPrice(double s)
	{
		this.currentPrice = s;
		return true;
	}
	// getter
	public char getSymbol()
	{
		return this.Symbol;
	}
	public String getName()
	{
		return this.Name;
	}
	public double getPreviousClosingPrice()
	{
		return this.previousClosingPrice;
	}
	public double getCurrentPrice()
	{
		return this.currentPrice;
	}
	public double getChangePercent()
	{
		return (( this.currentPrice - this.previousClosingPrice )/100);
	}
	public String toString()
	{
		String s;
		s = "Symbol: "+this.Symbol+"\nName: "+this.Name+"\nPrevious Closing Price: "+this.previousClosingPrice+"\nCurrent Closing Price: "+this.currentPrice+"\nChanged Percentage: "+this.getChangePercent();
		return s;
	}
}
