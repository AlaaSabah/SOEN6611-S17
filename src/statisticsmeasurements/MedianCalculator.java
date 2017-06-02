package statisticsmeasurements;

import java.util.ArrayList;

public class MedianCalculator {
	
	public static double findMedian(ArrayList<Double> values){
		if(values == null || values.size() == 0)
			return -1000.0;
		ArrayList<Double> sorted = sort((ArrayList<Double>)values.clone());
		
		int size = sorted.size();
		// N is odd
		if(size%2 == 1){
			return sorted.get(size/2);
		}
		// N is even
		return (sorted.get(size/2-1)+sorted.get(size/2))/2.0;
	}
	
	public static ArrayList<Double> sort(ArrayList<Double> values){
		ArrayList<Double> sorted = new ArrayList<Double>();
		while(values.size()>1){
			double min = MinCalculator.findMin(values);
			sorted.add(min);
			values.remove(min);
		}
		sorted.add(values.get(0));
		return sorted;
			
	}
	
}
