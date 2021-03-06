package statisticsmeasurements;

public class RandomGenerator {

	private static final double root = 0.19283746584130;
	private static double previous = 1;
	
	public static double getRandom(double low, double high){
		
		double v = ((System.currentTimeMillis()*root)%(System.currentTimeMillis()+root)*previous*root)%1;
		v = v*(high-low)+low;
		previous = v;
		if(previous <= 0.0)
			previous = 1.0;
		return v;
	}

}
