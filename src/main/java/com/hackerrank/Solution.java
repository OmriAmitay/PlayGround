package com.hackerrank;

import java.util.Arrays;

public class Solution {
	
	 static int[] getMinimumDifference(String[] a, String[] b) {
		 	
		 int []diff = new int[a.length];
		 
		 for(int i = 0; i < a.length; i++) {
			 diff[i] = findAnagramDiff(a[i], b[i]);
		 }

		 return diff;
	 }
	
	public static int findAnagramDiff(String a, String b) {
		
		if(a.length() != b.length()) {
			return -1;
		}
		
		int [] charHistograma =  new int[26];
		
		for(char c : a.toCharArray()){
			charHistograma[c - 'a']++;
		}
		
		for(char c : b.toCharArray()){
			charHistograma[c - 'a']--;
		}
		
		int diff = 0;
		for(int i : charHistograma){
			diff += Math.abs(i);
		}
		
		return diff / 2;  // because they are in the same length
	
    }
	
	public static String sortStr(String str) {
		char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
	}

  
    public static void main(String[] args) {
    	
    	String []a = {"a","jk","abb","mn","abc"};
    	String []b = {"bb","kj","bbc","op","def"};
    	
    	System.out.println(getMinimumDifference(a, b));
    	
    	//System.out.println(freq("a", "bb"));
    	//System.out.println(freq("jk", "kj"));
    	//System.out.println(freq("abb", "bbc"));
    	//System.out.println(freq("mn", "op"));
    	//System.out.println(freq("abc", "def"));
        
    }
    
   
    
}