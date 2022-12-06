package com.vishnu;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] arr = {15,20,10,50,18,5,45,30,75};
        SequentialSearch ss = new SequentialSearch();
        ss.search(arr,30);
    }
    public void search(int [] arr, int value){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == value) {
                System.out.println("found at position " + i);
                return;
            }
        }
        System.out.println("element not found");
    }
}
