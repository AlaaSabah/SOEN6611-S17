package statisticsmeasurements;

import java.util.ArrayList;

public class StandardDeviationCalculator {
	

	public static double findStandardDeviation(ArrayList<Double> values){
	
		if(values == null || values.size() == 0)
			return -1000.0;
		double mean;
		
		mean = MeanCalculator.findMean(values);
		ArrayList<Double> temp = new ArrayList<Double>();
		for(int i = 0; i<values.size(); i++){
			temp.add((values.get(i).doubleValue()-mean)*(values.get(i).doubleValue()-mean));
		}
		mean = MeanCalculator.findMean(temp);
		return sqrRoot(mean);
	}
	
	//source of code: http://www.programcreek.com/2012/02/java-calculate-square-root-without-using-library-method/
	public static double sqrRoot(double num){
		
		double temp;
		double sqr = num/2.0;
		do{
			temp = sqr;
			sqr = (temp + num/temp)/2.0;
		}while(temp != sqr);
		
		return sqr;
	}
	
}