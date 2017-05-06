package statisticsmeasurements;

import java.util.ArrayList;

public class MinCalculator {
	
	public static double findMin(ArrayList<Double> values){
		
		if(values.size() == 0)
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
		System.out.println("Min value is : "+ MinCalculator.findMin(v));
	}
}
