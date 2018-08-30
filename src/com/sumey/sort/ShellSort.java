package com.sumey.sort;

/**
 * 希尔排序:分组，对每组进行插入排序
 * 时间复杂度：O(n)~O(n^2)   平均：O(n^1.5)
 * 空间复杂度：O(1)
 */

public class ShellSort {

    private static void shellSort(int[] A, int n) {
        int feet = n / 2;   //第一步：两个元素分组

        while (feet >= 1) {
            for (int i = feet; i < n; i++) {
                for (int j = i; j >= feet && A[j] < A[j - feet]; j -= feet) {
                    int temp = A[j];
                    A[j] = A[j - feet];
                    A[j - feet] = temp;
                }
            }
            feet = feet >> 1;
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 3, 4, 6, 0};
        shellSort(a, a.length);
        for (int x : a
                ) {
            System.out.println(x);
        }
    }


}
