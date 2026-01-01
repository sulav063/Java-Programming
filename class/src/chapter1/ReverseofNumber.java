package chapter1;

import java.util.Scanner;

public class ReverseofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user for a 5-digit number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Reverse the numberA
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;       // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;             // remove last digit
        }

        // Step 3: Print the reversed number
        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}
