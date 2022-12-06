package com.vishnu;
public class MissingRegNo {
    public static void main(String[] args) {
        int []arr = {1,1,2,2,3,3,5,5,4,4,6,6,7,7};
        int current;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            count = 0;
            current = arr[i];
            for(int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println("missing reg num = " + current);
                break;
            }
        }
        if(count == 2){
            System.out.println("no reg is missing");
        }

    }
}
