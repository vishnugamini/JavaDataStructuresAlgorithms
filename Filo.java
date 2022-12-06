package com.vishnu;

import java.util.Arrays;
import java.util.Scanner;
public class Filo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size - ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int [] ori = new int[size];
        for(int i = 0; i < size; i++){
            int flag = arr.length - 1;
            System.out.print("enter the number - ");
            int number = sc.nextInt();
            arr[0] = number;
            ori[i] = number;
            if (i == size - 1){
                break;
            }
            while(flag > 0){
                arr[flag] = arr[flag - 1];
                flag = flag - 1;
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.print("Original array - ");
        System.out.println(Arrays.toString(ori));

        System.out.print("Modified array - ");
        System.out.println(Arrays.toString(arr));
    }


}