package defaults;

public class Stopwatch {
	private long startTime; 
	private long stopTime; 
	
	public  Stopwatch() {
		startTime = 0;
		stopTime = 0;
	}
	
	// start timer
	public void startTimer( ) {
		startTime = System.currentTimeMillis();
		
		System.out.println("Timer Start: " + startTime);
	}
	
	
	// Stop time
	public void stopTimer() {
		stopTime = System.currentTimeMillis();
		
		System.out.println("Timer Stop: " + stopTime);
	}
	
	// calc. how long it took to sort array
	public long elapsedTime() {
		long elapsedTime = stopTime - startTime;
		
		return elapsedTime;
	}
}
