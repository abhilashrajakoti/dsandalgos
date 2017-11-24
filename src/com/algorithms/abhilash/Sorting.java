package com.algorithms.abhilash;

public class Sorting {

	public void selectionSortRecursive(int[] data, int start) {
		if (start < data.length) {
			swap(data, start, findMinimum(data, start));
			selectionSortRecursive(data, start + 1);
		}
	}

	private int findMinimum(int[] data, int start) {
		int minPos = start;
		for (int i = start + 1; i < data.length; i++)
			if (data[i] < data[minPos])
				minPos = i;
		return minPos;
	}

	private void swap(int[] data, int index1, int index2) {
		if (data[index1] != data[index2]) {
			int temp = data[index1];
			data[index1] = data[index2];
			data[index2] = temp;
		}
	}

	public void selectionSort(int[] data) {
		int minPos;
		for (int i = 0; i < data.length; i++) {
			minPos = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] < data[minPos])
					minPos = j;
			}
			swap(data, i, minPos);
		}
	}

	public void insertionSort(int[] data) {
		int i = 0;
		int key = 0;
		for (int j = 1; j < data.length; j++) {
			key = data[j];
			i = j - 1;
			while (i >= 0 && data[i] > key) {
				data[i + 1] = data[i];
				i--;
			}
			data[i + 1] = key;
		}
	}

	public void quickSort(int[] data, int p, int r) {
		if (p < r) {
			int q = partion(data, p, r);
			quickSort(data, p, q - 1);
			quickSort(data, q + 1, r);
		}

	}

	public int partion(int[] data, int p, int r) {
		int x = data[r];
		int i = p - 1;
		for (int j = p; j <= (r - 1); j++) {
			if (data[j] <= x) {
				i++;
				swap(data, i, j);
			}
		}
		swap(data, i + 1, r);
		return i + 1;
	}

	public void mergeSort(int[] data, int p, int r) {
		if (p < r) {
			int q = (r + p) / 2;
			mergeSort(data, p, q);
			mergeSort(data, q + 1, r);
			merge(data, p, q, r);
		}
	}

	public void merge(int[] data, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] left = new int[n1 + 1];
		int[] right = new int[n2 + 1];
		for (int i = 0; i < n1; i++)
			left[i] = data[p + i];
		for (int j = 0; j < n2; j++)
			right[j] = data[q + j + 1];
		left[n1] = Integer.MAX_VALUE;
		right[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for (int k = p; k <= r; k++) {
			if (left[i] <= right[j]) {
				data[k] = left[i];
				i++;
			} else {
				data[k] = right[j];
				j = j + 1;
			}

		}
	}

}
