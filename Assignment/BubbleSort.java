package Assignment;

import java.util.Arrays;

public class BubbleSort {
	
	void bubblesort (int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n-1; i++)
			for(int j = 0; j<n-i-1; j++)
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] =  arr[j+1];
					arr[j+1] = temp;
				}					
	}
	void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n; ++i)
			System.out.println(arr[i] + " ");
		System.out.println(); 
	}

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int arr[] = {5, 1, 4, 2, 8};
		System.out.println("Given Array:" );
		System.out.println(Arrays.toString(arr));
		System.out.println("\n");
		obj.bubblesort(arr); 
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(arr));
		//obj.printArray(arr); 
		

	}

}
