package statisticsmeasurements;

import java.util.ArrayList;

public class MeanCalculator {
	double sum;
	double mean;
	
	public static double findMean(ArrayList<Double> values){
		if(values == null || values.size() == 0)
			return -1000.0;
		int size = values.size();
		double sum = 0;
		for(int i = 0; i<size; i++){
			sum+= values.get(i).doubleValue();
		}
		double mean = sum/size;

		return mean;
	}
	

}
