package com.sumey.sort;

/**
 * @author sumey
 * @date 2018/9/3 下午9:33
 */
//堆排序

public class HeapSort {

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void heapSort(int[] a, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapAdjust(a, i, n - 1);   //建立大根堆
        }
        //排序
        for (int i = n - 1; i > 0; i--) {
            swap(a, i, 0);
            heapAdjust(a, 0, i - 1);
        }
    }


    //堆调整
    private static void heapAdjust(int[] a, int i, int m) {
        while (2 * i + 1 <= m) {
            int k = 2 * i + 1;
            if (k < m && a[k] < a[k + 1]) { //找出最大的子节点元素
                k++;
            }
            if (a[k] > a[i]) {
                swap(a, k, i);
                i = k;
            } else {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {3, 0, 9, 6, 3, 10};
        heapSort(a, a.length);
        for (int x : a
                ) {
            System.out.println(x);

        }
    }
}
