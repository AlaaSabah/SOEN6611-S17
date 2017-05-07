package statisticsmeasurements;

import java.util.ArrayList;

public class StandardDeviationCalculator {
	

	public static double findStandardDeviation(ArrayList<Double> values){
	
		double mean;
		double variance;
		double standarddeviation;
	
		for(int i = 1; i<size; i++){
			temp += (values.get(i).doubleValue()-MeanCalculator.findMean(mean))*(values.get(i).doubleValue()-MeanCalculator.findMean(mean))
		}
		
		variance = temp/size;
		standarddeviation = Math.sqrt(variance);
		return standarddeviation;
	}
	
public static void main(String[] args){
		
		ArrayList<Double> v = new ArrayList<Double>();
		double d = 0.0;
		System.out.println("The random values are :");
		for(int i = 0; i<100; i++){
			d = Math.random()*100.0;
			v.add(d);
			System.out.print(d+",  ");
		}
		System.out.println();
		System.out.println("Standard Deviation value is : "+ StandardDeviationCalculator.findStandardDeviation(standarddeviation));
	}
	
}