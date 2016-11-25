package com.base.merge;

public class MergeSort {

	private static int[] merge(int[] arr, int p, int q, int r) {
		int n = q - p + 1;
		int m = r - q;
		int left[] = new int[n];
		int right[] = new int[m];
		for (int i = 0; i < n; i++) {
			left[i] = arr[p + i - 1];
		}
		for (int i = 0; i < m; i++) {
			right[i] = arr[q + i];
		}
		int i = 1, j = 1;
		for (int k = p; k < r; k++) {
			if (i != left.length && left[i] < right[i]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
		}
		return arr;
	}

	private static int[] mergeSort(int[] arr, int p, int r) throws Exception {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(arr, p, q);
			mergeSort(arr, q + 1, r);
			merge(arr, p, q, r);
			return arr;
		} else {
			throw new Exception(" 'p' can't more than 'r'!");
		}
		
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 7, 1, 18, 46, 8, 9, 15, 0, 10, 9, 65, 45 };
		try {
		arr = 	MergeSort.mergeSort(arr, 0, arr.length);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
