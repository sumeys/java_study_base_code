package com.sumey.sort;


/**
 * 插入排序
 * 时间复杂度：O(n)~O(n^2)   平均：O(n^2)
 * 空间复杂度：O(1)
 */

public class InsertSort {
    private static void insertSort(int[] A, int n) {
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && A[j] < A[j - 1]; j--) {
                int temp = A[j];
                A[j] = A[j - 1];
                A[j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 3, 4, 6, 0};
        insertSort(a, a.length);
        for (int x : a
                ) {
            System.out.println(x);
        }
    }
}
