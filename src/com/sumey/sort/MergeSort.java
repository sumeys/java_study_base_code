package com.sumey.sort;

/**
 * @author sumey
 * @date 2018/9/5 下午4:15
 */

/**
 * 归并排序：O(nLogn)~O(nLogn)  平均O(nLogn)
 * 空间：O(n)
 */
public class MergeSort {

    private static void mergeSort(int[] A, int n) {
        mSort(A, 0, n - 1);
    }

    private static void mSort(int[] A, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mSort(A, left, mid);
        mSort(A, mid + 1, right);
        merge(A, left, mid, right);
    }

    private static void merge(int[] A, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int leftIndex = left;
        int rightIndex = mid + 1;
        int tempIndex = 0;
        while (leftIndex <= mid && rightIndex <= right) {
            temp[tempIndex++] = A[leftIndex] < A[rightIndex] ? A[leftIndex++] : A[rightIndex++];
        }
        while (leftIndex <= mid) {
            temp[tempIndex++] = A[leftIndex++];
        }
        while (rightIndex <= right) {
            temp[tempIndex++] = A[rightIndex++];
        }
        int t = 0;
        while ((t + left) <= right) {
            A[t + left] = temp[t];
            t++;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 0, 9, 18, 1, 4, 6};
        mergeSort(a, a.length);
        for (int x : a
                ) {
            System.out.println(x);
        }
    }
}
