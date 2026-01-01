package chapter1;

import java.util.Scanner;

public class Maximuminarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take array input
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find largest number
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Output
        System.out.println("Largest number is: " + max);
    }
}
