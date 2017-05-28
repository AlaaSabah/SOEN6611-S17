package view;

import java.util.ArrayList;
import java.util.Scanner;

import statisticsmeasurements.MaxCalculator;
import statisticsmeasurements.MeanCalculator;
import statisticsmeasurements.MedianCalculator;
import statisticsmeasurements.MinCalculator;
import statisticsmeasurements.ModeCalculator;
import statisticsmeasurements.RandomGenerator;
import statisticsmeasurements.StandardDeviationCalculator;

public class UserInterface {
	
	public static void main(String[]args){
		int size = 0;
		String choice;
		ArrayList<Double> dataset = null;;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to DESCRIPTIVE-STATISTICS system :)....");
		System.out.println();
		System.out.println("Please enter the size of the dataset to be generated..");
		while(true){
			try{
				size = Integer.parseInt(scanner.next());
				break;
			}catch(Exception e){
				System.out.println("Please enter only a number for the size..");
			}
		}
		
		dataset = getDataset(size);
		
		while(true){
		System.out.println();	
		System.out.println("1. To set the size of the dataset and generate its values, please enter \"new\".");
		System.out.println("2. To sort the dataset, please enter \"sort\".");
		System.out.println("3. To find the minimum, please enter \"m\".");
		System.out.println("4. To find the maximum, please enter \"M\".");
		System.out.println("5. To find the mode, please enter \"o\".");
		System.out.println("6. To find the median, please enter \"d\".");
		System.out.println("7. To find the mean, please enter \"u\".");
		System.out.println("8. To find the standard deviation, please enter \"sd\".");
		System.out.println("9. To end, please enter \"x\".");
		
		choice = scanner.next();
		
		if(choice.equals("new")){
			System.out.println("Please enter the size of the dataset to be generated..");
			while(true){
				try{
					size = Integer.parseInt(scanner.next());
					break;
				}catch(Exception e){
					System.out.println("Please enter only a number for the size..");
				}
			}
			
			dataset = getDataset(size);
		}else if(choice.equals("sort")){
			System.out.println("Sorted Dataset  is : ");
			dataset = MedianCalculator.quickSort(dataset, 0, dataset.size()-1);
			System.out.println(ModeCalculator.printData(dataset));
		}else if(choice.equals("m")){
			System.out.println("Minimum value  = "+MinCalculator.findMin(dataset));
		}else if(choice.equals("M")){
			System.out.println("Maximum value  = "+MaxCalculator.findMax(dataset));
		}else if(choice.equals("o")){
			System.out.println("Mode value  = "+ModeCalculator.printData(ModeCalculator.findMode(dataset)));
		}else if(choice.equals("d")){
			System.out.println("Median value  = "+MedianCalculator.findMedian(dataset));
		}else if(choice.equals("u")){
			System.out.println("Mean value  = "+MeanCalculator.findMean(dataset));
		}else if(choice.equals("sd")){
			System.out.println("Standard deviation value  = "+StandardDeviationCalculator.findStandardDeviation(dataset));
		}else if(choice.equals("x")){
			break;
		}else{
			System.out.println("Please enter a valid choice..");
		}
		}
		
	}
	
	public static ArrayList<Double> getDataset(int size){
		ArrayList<Double> data = new ArrayList<Double>();
		double v;
		System.out.println("Dataset elements are:  ");
		for(int i = 0 ; i<size ; i++){
			v = RandomGenerator.getRandom(0, 100);
			data.add(v);
			if(i%9 == 0)
				System.out.println();
			System.out.print(v+", ");
		}
		System.out.println();
		
		return data;
	}

}
