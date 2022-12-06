package com.vishnu;

import java.util.Scanner;

public class ArrayStack {
    public void useStack(){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10];
        int pointer  = -1;
        int current = 0;
        while (true){
            System.out.println("1.)push\n2.)pop\n3.)peek\n4.)display\n5.)exit");
            int val = sc.nextInt();
            if (val == 1){
                if (current == arr.length){
                    System.out.println("stack is full");
                }
                else {
                    System.out.print("enter element - ");
                    int element = sc.nextInt();
                    arr[current] = element;
                    current++;
                    pointer++;
                }
            }
            else if(val == 2){
                if (pointer == -1){
                    System.out.println("no elements left to pop");
                }
                else {
                    arr[pointer] = 0;
                    pointer--;
                    current--;
                    System.out.println("element popped");
                }
            }
            else if(val == 3)
                System.out.println(arr[pointer]);

            else if (val == 4){
                for (int i = pointer; i >= 0; i--){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            else if (val == 5){
                return;
            }
        }
    }
}
