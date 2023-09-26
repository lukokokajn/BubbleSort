package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] arrayNum =  {11, 2, 7, 6, 13, 8, 4};
       boolean swap = true;
       while (swap){
           swap = false;
           for (int i = 0; i < arrayNum.length - 1; i++) {
               if(arrayNum[i] > arrayNum[i + 1]){
                   swap = true;
                   int temp = arrayNum[i];
                   arrayNum[i] = arrayNum[i + 1];
                   arrayNum[i + 1] = temp;
               }
           }
       }
        System.out.println(Arrays.toString(arrayNum));
    }
}