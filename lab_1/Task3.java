package lab_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int in = scaner.nextInt();
        scaner.close();
        System.out.println(in > 0 ? in + 1 : in);
    }
}
