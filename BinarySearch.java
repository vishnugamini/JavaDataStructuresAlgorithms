package com.vishnu;

public class BinarySearch {
    private int first;
    private int last;
    private int [] arr;

    public BinarySearch(int [] arr){
        this.arr = arr;
    }

    public void searchNum(int number){
        first = 0;
        last = arr.length - 1;
        int mid = (first + last) / 2;
        while (first <= last){
            int value = arr[mid];
            if (number < value)
                last = mid - 1;

            else if (number == value){
                System.out.println("the number " + number + " is found at position " + mid);
                break;
            }

            else
                first = mid + 1;

            mid = (first + last) / 2;
        }
    }

}
