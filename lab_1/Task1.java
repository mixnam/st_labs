package lab_1;

import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        String in = scaner.nextLine();
        scaner.close();
        char lastNumber = in.charAt(in.length() - 1);
        System.out.println(lastNumber);
    }
}