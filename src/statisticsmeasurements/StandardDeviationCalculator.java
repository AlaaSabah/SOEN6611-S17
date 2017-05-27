package statisticsmeasurements;

import java.util.ArrayList;

public class StandardDeviationCalculator {
	

	public static double findStandardDeviation(ArrayList<Double> values){
	
		double mean;
		
		mean = MeanCalculator.findMean(values);
		ArrayList<Double> temp = new ArrayList<Double>();
		for(int i = 0; i<values.size(); i++){
			temp.add((values.get(i).doubleValue()-mean)*(values.get(i).doubleValue()-mean));
		}
		mean = MeanCalculator.findMean(temp);
		return sqrRoot(mean);
	}
	
	public static double sqrRoot(double num){
		double temp;
		double sqr = num/2.0;
		do{
			temp = sqr;
			sqr = (temp + num/temp)/2.0;
		}while(temp != sqr);
		return sqr;
	}
	
public static void main(String[] args){
		
		ArrayList<Double> v = new ArrayList<Double>();
		double d = 0.0;
		System.out.println("The random values are :");
		for(int i = 0; i<100; i++){
			d = RandomGenerator.getRandom(0.0, 100.0);
			v.add(d);
			System.out.print(d+",  ");
		}
		System.out.println();
		System.out.println("Standard Deviation value is : "+ StandardDeviationCalculator.findStandardDeviation(v));
	}
	
}