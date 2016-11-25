package com.base.insert;

public class InsertSort {

	public InsertSort() {
		// TODO Auto-generated constructor stub
	}

	public static int[] sort(int[] obj) {
		int len = obj.length;
		int j = 1;
		for (; j < len; j++) {
			int key = obj[j];
			int i = j - 1;
			while (i >= 0 && obj[i] > key) {
				obj[i + 1] = obj[i];
				i = i - 1;
			}
		obj[i + 1] = key;
		}
		return obj;
	}

	public static void main(String[] args) {
		int[] a = { 5, 3, 4, 7, 1, 18, 46, 8, 9, 15, 0, 10, 9, 65, 45 };
		a = InsertSort.sort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
