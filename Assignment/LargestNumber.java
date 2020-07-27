package Assignment;

import java.util.Arrays;

public class LargestNumber {
	
    
	public static void main(String[] args) {
	  int[] arr = new int[] { 100 , 80, 30 };
	   System.out.println("Original Array:");
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]+ " ");
	}
	
	 System.out.println();
	 System.out.println("extended Array");
	 int[] extended = new int[5];
	 extended[3] = 40;
	 extended[4] = 50;
	 System.arraycopy(arr ,0, extended , 0, arr.length);
	  
	 for(int str : extended) {
		  System.out.println(str);
	 }
	 
	int max =  Arrays.stream(extended).max().getAsInt();
	System.out.println("Largest Number in array is:" +max); 
	
	}

}
 