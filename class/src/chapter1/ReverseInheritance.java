package chapter1;

import java.util.Scanner;

// Class 1: Take number input
class NumberInput {
    int num;

    void getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
    }
}

// Class 2: Reverse number (inherits NumberInput)
class ReverseNumber extends NumberInput {

    void reverse() {
        int temp = num;
        int reversed = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}

// Class 3: Main class (caller)
public class ReverseInheritance {
    public static void main(String[] args) {

        // Create object of ReverseNumber
        ReverseNumber obj = new ReverseNumber();

        // Call parent class method
        obj.getNumber();

        // Call child class method
        obj.reverse();
    }
}
