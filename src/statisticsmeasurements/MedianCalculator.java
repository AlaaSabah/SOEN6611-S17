package statisticsmeasurements;

import java.util.ArrayList;

public class MedianCalculator {
	
	public static double findMedian(ArrayList<Double> values){
		
		values = quickSort(values, 0, values.size()-1);
		
		int size = values.size();
		// N is odd
		if(size%2 == 1){
			return values.get(size/2);
		}
		// N is even
		return (values.get(size/2-1)+values.get(size/2))/2.0;
	}
	
//	public static ArrayList<Double> sort(ArrayList<Double> values){
//		ArrayList<Double> sorted = new ArrayList<Double>();
//		while(values.size()>1){
//			double min = MinCalculator.findMin(values);
//			sorted.add(min);
//			values.remove(min);
//		}
//		sorted.add(values.get(0));
//		return sorted;
//			
//	}
	
	public static ArrayList<Double> quickSort(ArrayList<Double> values, int left, int right){
		
		if(left >= right){
			return values;
		}
		
		double pivot = values.get(right).doubleValue();
		int partition = partition(values, left, right, pivot);
		 return quickSort(quickSort(values, left, partition-1), partition+1, right);
		
	}
	
	public static int partition(ArrayList<Double> values, int left, int right, double pivot){
		int rightPointer = right-1;
		//System.out.println("left   "+left);
		while(true){
			while(values.get(left).doubleValue() < pivot){
				left++;
				//System.out.println("loop 1");
			}
			while(rightPointer >= 0 && values.get(rightPointer).doubleValue() >= pivot){
				rightPointer--;
				//System.out.println("loop 2");
			}
			//System.out.println(left+"   r: "+rightPointer);
			if(left >= rightPointer){
				break;
			}else{
				double leftValue = values.get(left).doubleValue();
				double rightValue = values.get(rightPointer).doubleValue();
				values.set(left, rightValue);
				values.set(rightPointer, leftValue);
			}
		}
		//swap pivot with left
		values.set(right, values.get(left));//in place of pivot
		values.set(left, pivot);
		return left;
	}

	public static void main(String[]args){
		
		ArrayList<Double> v = new ArrayList<Double>();
		double d = 0.0;
		System.out.println("The random values are :");
		for(int i = 0; i<100; i++){
			d = RandomGenerator.getRandom(0.0, 100.0);
			v.add(d);
			
		}
		for(int i=0; i<v.size(); i++){
			if(i%10 == 0)
				System.out.println();
			System.out.print(v.get(i)+",  ");
		}
		System.out.println();
		System.out.println();
		//sort the values then find median
		double median = MedianCalculator.findMedian(v);
		for(int i=0; i<v.size(); i++){
			System.out.print(v.get(i)+",  ");
		}
		System.out.println();
		System.out.println("Median value is : "+ median);
		
	}
}
