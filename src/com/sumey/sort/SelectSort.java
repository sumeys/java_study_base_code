package com.sumey.sort;

/**
 * 选择排序：每次找到最小的，插入到第一位，再找到次小的，插入到第二位，依次类推
 * 时间复杂度：O(n^2)~O(n^2)  平均：O(n^2)
 * 空间复杂度：O(1)
 */

public class SelectSort {

    private static void selectSort(int[] A, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (A[min] > A[j]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = A[min];
                A[min] = A[i];
                A[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 3, 4, 6, 0};
        selectSort(a, a.length);
        for (int x : a
                ) {
            System.out.println(x);
        }
    }
}
