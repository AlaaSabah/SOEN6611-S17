package statisticsmeasurements;

import java.util.ArrayList;

public class MedianCalculator {
	
	public static double findMedian(ArrayList<Double> values){
		
		int size = values.size();
		// N is odd
		if(size%2 == 1){
			return values.get(size/2);
		}
		// N is even
		return (values.get(size/2-1)+values.get(size/2))/2.0;
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

	public static void main(String[]args){
		
		ArrayList<Double> v = new ArrayList<Double>();
		double d = 0.0;
		System.out.println("The random values are :");
		for(int i = 0; i<100; i++){
			d = Math.random()*100.0;
			v.add(d);
			
		}
		//sort the values
		ArrayList<Double> sorted = MedianCalculator.sort(v);
		for(int i=0; i<sorted.size(); i++){
			System.out.print(sorted.get(i)+",  ");
		}
		System.out.println();
		System.out.println("Median value is : "+ MedianCalculator.findMedian(sorted));
		
	}
}
