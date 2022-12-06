package com.vishnu;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int [] arr = {15,20,10,50,18,5,45,30,75,1,5,2,3,0};
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++){
            int min = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    k = j;
                }
            }
            if (k != 0) {
                int temp = arr[i];
                arr[i] = min;
                arr[k] = temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
