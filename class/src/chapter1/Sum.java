package chapter1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, sum;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        sum = a + b;

        System.out.println("Sum = " + sum);
        System.out.println("Working Directory: " + System.getProperty("user.dir"));
    }
}
