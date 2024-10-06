import java.util.*;

class StopWatch
{
	private long startTime,endTime;

	
	public StopWatch(long startTime) {
		this.startTime = startTime;
	}
	
	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	
	public void start()
	{
		startTime = System.currentTimeMillis();
	}
	
	public void end()
	{
		endTime = System.currentTimeMillis();
	}
	public long getElapsedTime()
	{
		return (endTime-startTime);
	}
	


}
public class Q1_stopWatch {
	public static void main(String[] Args)
	{
		StopWatch s = new StopWatch(System.currentTimeMillis());
		
	}
}
