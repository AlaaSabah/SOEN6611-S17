package statisticsmeasurements;

import java.util.ArrayList;
import java.util.Collections;

public class ModeCalculator {
	

	public static ArrayList<Double> findMode(ArrayList<Double> values){
		if(values == null || values.size() == 0)
			return new ArrayList<Double>();
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
	
	public static String printData(ArrayList<Double> data){
		String s = "";
		for(int i=0; i<data.size(); i++){
			if(i%5 == 0)
				s+="\n";
			s+=data.get(i)+"\t\t";
		}
		
		return s;
	}

}
