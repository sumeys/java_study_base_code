package com.sumey.sort;


/**
 * 冒泡排序:
 * 时间复杂度：O(n)~O(n^2)  平均：O(n^2)
 * 空间复杂度： O(1)
 */

public class BubbleSort {

    private static void bubbleSort(int[] A, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }
}
