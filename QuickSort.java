package com.vishnu;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public void sort(int [] arr){
        sort(arr,0,arr.length - 1);
    }
    private void sort(int[] arr, int start, int end){
        if (start >= end)
            return;
        int boundary = partition(arr,start,end);
        sort(arr,start,boundary - 1);
        sort(arr,boundary + 1,end);
    }

    private int partition(int [] arr, int start, int end){
        int pivot = arr[end];
        int boundary = start - 1;
        for (int i = 0; i <= end; i++){
            if (arr[i] <= pivot){
                boundary++;
                int temp = arr[boundary];
                arr[boundary] = arr[i];
                arr[i] = temp;
            }
        }
        return boundary;
    }


    public static void main(String[] args) {
        int[] arr = {5,1,4,8,3,2,6};
        QuickSort qs = new QuickSort();
        qs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
