

package com.mycompany.linearsearchuserinputlab;

import java.util.Scanner;

public class LinearSearchUserInputLab {

    public static int linearsearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        
        System.out.println("Enter size of array: ");
        int number = scn.nextInt();
        
        while (number < 10 || number > 20) {
            System.out.println("Try again.\n\nEnter size of array: ");
            number = scn.nextInt();
        }
        
        int[] data = new int[number];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < number; i++) {
            data[i] = scn.nextInt();
        }
        System.out.println("Enter value to search in array: ");
        int target = scn.nextInt();
        int result = linearsearch(data, target);
         if (result != -1) {
            System.out.println("Element found in index number: " + result);
        }
        else {
            System.out.println("Element not found.");
        }
        scn.close();
   }
}
