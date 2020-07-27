package Assignment;

import java.util.Arrays;

public class ReverseArray {
	
	 static void reverse(int a[], int n) {
		
		int i,k,temp;
		
		for(i = 0; i < n/2; i++) 
		{
			temp = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = temp;
		}
			
		System.out.println("Reversed Array:"); 
		for(k = 0; k<n; k++) {
			System.out.println(a[k]);
		
		}
	}

	public static void main(String[] args) {
		int [] arr = {1 , 2 , 3 , 4 };
		System.out.println("Given Array:");
		System.out.println(Arrays.toString(arr));
        reverse(arr,arr.length);

	}

}
