package com.qa.day1;

//import java.util.*;

public class ActualQuestionFour {
	
	public static void main(String[] args) {
		
	}
	public boolean evenlySpaced(int a, int b, int c) {
		int jeff;
		if(a > b) {
			jeff = a;
			a = b;
			b = jeff;
		}
		
		if(b > c) {
			jeff = b;
			b = c;
			c = jeff;
		}
		
		if(a > b) {
			jeff = a;
			a = b;
			b = jeff;
		}
		return b - a == c -b;
		
		//return false;
	}
			
//	  public static void main(String[] args) {
//	    int[][] data = {
//	    		
//	      { 4, 50, 3 }  //-> false
//	    };
//	    for (int[] d: data) {
//	      System.out.printf("%s - %s%n", toList(d), areEvenlySpaced(toList(d)));
//	    }
//	  }
//	  public static boolean areEvenlySpaced(List<Integer> list) {
//	    Collections.sort(list, new Comparator<Integer>() {
//	        public int compare(Integer i1, Integer i2) {
//	            return i2.compareTo(i1);
//	        }
//	    });
//	    if (list != null && list.size() > 1) {
//	      int lastDiff = list.get(0) - list.get(1);
//	      for (int i = 1; i < list.size(); i++) {
//	        int diff = Math.abs(list.get(i-1) - list.get(i));
//	        if (lastDiff != diff) return false;
//	        lastDiff = diff;
//	      }
//	      return true;
//	    }
//	    return false;
//	  }
//	  public static List<Integer> toList(int[] values) {
//	    List<Integer> list = new ArrayList<Integer>(values.length);
//	    for (int n : values) list.add(n);
//	    return list;
//	  }
	}