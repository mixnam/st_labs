package lab_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = scaner.nextInt();
        System.out.println("Enter your number : ");
        int b = scaner.nextInt();
        System.out.println("Enter your number : ");
        int c = scaner.nextInt();
        scaner.close();
        System.out.println(
            a > b 
                ? a > c 
                    ? a
                    : b > c
                        ? b
                        : c
                : b > c
                    ? b
                    : c
        );
    }
}
