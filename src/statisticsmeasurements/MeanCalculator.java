package statisticsmeasurements;

import java.util.ArrayList;

public class MeanCalculator {
	double sum;
	double mean;
	
	public static double findMean(ArrayList<Double> values){
		int size = values.size();
		double sum = 0;
		for(int i = 0; i<size; i++){
			sum+= values.get(i).doubleValue();
		}
		double mean = sum/size;

		return mean;
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
		System.out.println("Mean value is : "+ MeanCalculator.findMean(v));
	}

}
