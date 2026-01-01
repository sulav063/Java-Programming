package chapter1;

import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Null Pointer Exception
        try {
            System.out.print("Enter a string (type null): ");
            String str = sc.nextLine();

            if (str.equals("null")) {
                str = null;
            }

            System.out.println("Length = " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred");
        }

        // 2. Array Index Out of Bounds Exception
        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int arr[] = new int[size];

            System.out.println("Enter array values:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter index to access: ");
            int index = sc.nextInt();

            System.out.println("Value = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        }

        // 3. Arithmetic Exception
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Result = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred");
        }

        sc.close();
    }
}
