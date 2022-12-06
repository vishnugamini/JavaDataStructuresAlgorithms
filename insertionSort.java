package com.vishnu;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {15,20,10,50,18,5,45,30,75,1,5,2,3};
        for (int i = 1; i < arr.length; i++){
            int comp_a = i;
            int comp_b = i - 1;
            while (comp_b >= 0 || comp_a > 0){
                if (arr[comp_a] <= arr[comp_b]){
                    int temp = arr[comp_a];
                    arr[comp_a] = arr[comp_b];
                    arr[comp_b] = temp;
                }
                else
                    break;
                comp_a--;
                comp_b--;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
