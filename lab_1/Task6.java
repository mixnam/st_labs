package lab_1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = scaner.nextInt();
        scaner.close();
        if (a == 0) {
            System.out.println("Нулевое число");
            return;
        } 

        String sign = a > 0 ? "положительное" : "отрицательно";
        String even = a % 2 == 0 ? "четное" : "нечетное";
        System.out.println(String.format("%s %s число", sign, even));
    }
}
