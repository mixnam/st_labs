package lab_1;

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        String in = scaner.nextLine();
        scaner.close();
        String[] arr = in.split("");
        Optional<Integer> result = Stream.of(arr).map(x -> Integer.parseInt(x)).reduce((x, y) -> x + y);
        System.out.println(result.get());
    }
}
