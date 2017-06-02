package statisticsmeasurements;

import java.util.ArrayList;

public class MaxCalculator {
	
	public static double findMax(ArrayList<Double> values){
		
		if(values == null || values.size() == 0)
			return -1000.0;
		if(values.size() == 1)
			return values.get(0).doubleValue();
		
		int size = values.size();
		double max = values.get(0).doubleValue();
		
		for(int i = 1; i<size; i++){
			if(values.get(i).doubleValue() > max){
				max = values.get(i).doubleValue();
			}
		}
		
		return max;
	}

}
