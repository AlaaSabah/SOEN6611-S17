package statisticsmeasurements;

import java.util.ArrayList;
import java.util.Collections;

public class ModeCalculator {
	

	public static ArrayList<Double> findMode(ArrayList<Double> values){
		
		int size = values.size();
		ArrayList<Double> frequency = new ArrayList<Double>(Collections.nCopies(size, 0.0));
		
		for(int i = 0; i<size; i++){
			 frequency.add(values.indexOf(values.get(i)), frequency.get(values.indexOf(values.get(i)))+1.0);
		}
		 
		double maxFreq = MaxCalculator.findMax(frequency);
		System.out.println("Max frequency is "+maxFreq+" times");
		ArrayList<Double> modeValues = new ArrayList<Double>();
		for(int i= 0; i<size; i++){
			if(frequency.get(i).doubleValue() == maxFreq){
				modeValues.add(values.get(i));
			}
		}
		
		return modeValues;
	}
	
	public static String printMode(ArrayList<Double> mode){
		String s = "";
		for(int i=0; i<mode.size(); i++){
			s+=mode.get(i)+",  ";
		}
		
		return s;
	}
	
	public static void main(String[]args){
		ArrayList<Double> v = new ArrayList<Double>();
		double d = 0.0;
		int freq = 0;
		System.out.println("The random values are :");
		
		for(int i = 0; i<100; i++){
			d = Math.random()*100.0;
			freq = (int)(Math.random()*100+1);
			for(int j=0; j<freq; j++){
				v.add(d);
				System.out.print(d+",  ");
				if(v.size() == 100)
					break;
			}
			if(v.size() == 100)
				break;
		}
		
		System.out.println();
		System.out.println("Mode values are : "+ ModeCalculator.printMode(ModeCalculator.findMode(v)));
	}


}
