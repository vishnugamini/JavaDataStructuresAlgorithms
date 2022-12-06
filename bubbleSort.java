package com.vishnu;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {75,15, 20, 10, 30, 50, 18, 5,2};
        boolean isSorted;
        for(int i = 1; i < arr.length; i++){
            isSorted = true;
            for (int j = 0; j < arr.length - i; j++){
                int k = j + 1;
                if (arr[k] < arr[j]){
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }

}





