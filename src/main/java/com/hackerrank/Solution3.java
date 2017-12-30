package com.hackerrank;

import java.util.Arrays;

public class Solution3 {
    
static int[] counts(int[] nums, int[] maxes) {
		
		Arrays.sort(nums);
		
        int []counters = new int[maxes.length];
        for(int i =0; i < maxes.length; i++) {
            
            int tempCount = 0;
            int tempMax = maxes[i];
            
            for(int k = 0; k < nums.length; k++) {
                
            	if(nums[k] > tempMax) {
            		break;
            	}
            	
                if(nums[k] <= tempMax) {
                    tempCount++;
                } 
                
            }
            
            counters[i] = tempCount;
        }
        
        return counters;
    }

  
    public static void main(String[] args) {
    	
    	int []nums = {2,10,5,4,8};
    	int []maxes = {3,1,7,8};
    	System.out.println(counts(nums, maxes));
        
    }
    
    public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
    
}