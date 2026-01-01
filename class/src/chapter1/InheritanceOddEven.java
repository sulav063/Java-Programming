package chapter1;

import java.util.Scanner;

// 1st class: Get array data
class ArrayInput {
    int[] arr;
    int n;

    void getArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}

// 2nd class: Check even or odd (inherits ArrayInput)
class EvenOdd extends ArrayInput {

    void checkEvenOdd() {
        System.out.println("Even numbers:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// 3rd class: Main class (caller)
public class InheritanceOddEven {
    public static void main(String[] args) {

        EvenOdd obj = new EvenOdd();

        // Call parent class method
        obj.getArray();

        // Call child class method
        obj.checkEvenOdd();
    }
}
