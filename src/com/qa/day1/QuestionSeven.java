package com.qa.day1;
//* Given a string, return the length of the largest "block" in the string. A
//* block is a run of adjacent chars that are the same, do not ignore case.

public class QuestionSeven {
	
	public static int superBlock(String input) {
		String str = "abbCCCddDDDDeeEEE";
		
    	if (str.length() == 0)
    		return 0;
    	else {
    		String current = "";
    		String next = "";
    		boolean same = false;
    		int max = 1;
    		int count = 1;
    	for (int i = 0; i < str.length(); i++) {
    		current = str.substring(i, i +1);
    		if(next.equals(current)) {
    			same = true;
    		}
    		else {
    			next = current;
    			same = false;
    			count = 1;
    		}
    		if (same) {
    			count++;
    			if (count > max) {
    				max = count;
    			}
    		}
    	}
    	return max;
}
}
	
	
	
	
}