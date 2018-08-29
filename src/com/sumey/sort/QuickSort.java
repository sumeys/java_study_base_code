package com.sumey.sort;

/**
 * 快速排序，也是分治思想的体现
 * 时间复杂度：O(nlog2n)~O(n^2)   平均: O(nlog2n)
 * 空间复杂度：O(nlog2n)
 */
public class QuickSort {

    //其实就是不断的把基数归位的过程

    private static void quickSort(int[] A, int left, int right) {
        if (left >= right) {
            return;
        }
        int key = A[left];
        int l = left;
        int r = right;

        //下面这个while循环每次都是在右侧找小数，在左侧找大数，然后交换的过程
        while (l < r) {
            while (l < r && A[r] >= key) {
                r--;
            }
            while (l < r && A[l] <= key) {
                l++;
            }
            int temp = A[l];
            A[l] = A[r];
            A[r] = temp;
        }
        //直到没有可以交换的地方，这时候l=r,，基数归位
        A[left] = A[l];
        A[l] = key;
        quickSort(A, left, l);
        quickSort(A, l + 1, right);
    }
}
