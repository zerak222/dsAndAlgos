package com.arrays.programs;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int arr[] = {40,40,60,10,60,50};
		firstWay(arr);

	}
    private static void firstWay(int[] aInputArray) {
		
    	hasDuplicates(aInputArray);
			
	}
	private static boolean hasDuplicates(int[] aInputArray) {
		Map<Integer,Boolean> mapOfIntegers = new HashMap<>();
    	for(int i:aInputArray) {
    		if(mapOfIntegers.get(i)!=null) {    			
    			System.out.println("Contains Duplicate");
    			return true;
    		}else {
    			mapOfIntegers.put(i,true);
    		}
    	}
    	System.out.println("No duplicates found");
    	return false;
	}

}
