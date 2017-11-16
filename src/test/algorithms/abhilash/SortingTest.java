package test.algorithms.abhilash;

import com.algorithms.abhilash.Sorting;

public class SortingTest {
	
	public static void main(String[] args) {
		int[] data= {100,23,9,1,90,200};
		new Sorting().insertionSort(data);
		for(int i:data) {
			System.out.print(i+" ");
		}
		
		
	}

}
