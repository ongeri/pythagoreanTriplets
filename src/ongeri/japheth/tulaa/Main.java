package ongeri.japheth.tulaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Given an array of integers return true if there is a triplet that satisfies pythagoras theorem
 */
public class Main {

    public static void main(String[] args) {
        int lengthOfArray = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        do {//This do while loop enables re-taking of user input in case it was invalid
            try {
                lengthOfArray = sc.nextInt();
            } catch (Exception e) {//Catch cases where user attempts to enter other characters instead of integer
                System.out.println("ERROR " + e.getMessage());
                sc = new Scanner(System.in);//Re-initialize scanner that may have crashed due to previous error
            }
            if (lengthOfArray < 1) {
                System.out.println("Enter a valid integer greater than 0");
            }
        } while (lengthOfArray < 1);
        System.out.println("Enter the " + lengthOfArray + " distinct numbers in the array");

        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < lengthOfArray; i++) {
            Integer number = null;
            do {
                try {
                    System.out.println("Enter number #" + (i + 1));
                    number = sc.nextInt();
                    values.add(number);
                } catch (Exception e) {
                    System.out.println("ERROR " + e.getMessage());
                    sc = new Scanner(System.in);
                }
            } while (number == null);
        }
    }
}
