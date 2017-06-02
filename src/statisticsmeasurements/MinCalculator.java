package statisticsmeasurements;

import java.util.ArrayList;

public class MinCalculator {
	
	public static double findMin(ArrayList<Double> values){
		
		if(values == null || values.size() == 0)
			return -1000.0;
		if(values.size() == 1)
			return values.get(0).doubleValue();
		
		int size = values.size();
		double min = values.get(0).doubleValue();
		
		for(int i = 1; i<size; i++){
			if(values.get(i).doubleValue() < min){
				min = values.get(i).doubleValue();
			}
		}
		
		return min;
	}
}
