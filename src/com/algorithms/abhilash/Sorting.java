package com.algorithms.abhilash;

public class Sorting {
	
	public void selectionSortRecursive(int[] data,int start) {
		if(start<data.length) {
		swap(data,start,findMinimum(data,start));
		selectionSortRecursive(data,start+1);
		}
	}
	
	private int findMinimum(int[] data,int start) {
		int minPos=start;
		for(int i=start+1;i<data.length;i++)
			if(data[i]<data[minPos])
				minPos=i;
		return minPos;
	}
	
	private void swap(int[] data,int index1,int index2) {
		if(data[index1]!=data[index2]) {
			int temp=data[index1];
			data[index1]=data[index2];
			data[index2]=temp;
		}
	}
	
	public void selectionSort(int[] data) {
		int minPos;
		for(int i=0;i<data.length;i++) {
			minPos=i;
			for(int j=i+1;j<data.length;j++) {
				if(data[j]<data[minPos])
					minPos=j;
			}
			swap(data,i,minPos);
		}
	}
	
	public void insertionSort(int[] data) {
		int i=0;
		int key=0;
		for(int j=1;j<data.length;j++) {
			key=data[j];
			i=j-1;
			while(i>=0 && data[i]>key) {
				data[i+1]=data[i];
				i--;
			}
			data[i+1]=key;
		}
	}

}
