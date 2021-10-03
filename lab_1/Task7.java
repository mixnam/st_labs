package lab_1;

import java.util.Optional;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = scaner.nextInt();
        scaner.close();
        Optional<String> region = Optional.empty();
        Optional<Double> price = Optional.empty();
        switch (a) {
            case 905:
                region = Optional.of("Москва");
                price = Optional.of(4.15);
                break;
            case 491:
                region = Optional.of("Краснодар");
                price = Optional.of(2.69);
                break;
            case 800:
                region = Optional.of("Киров");
                price = Optional.of(5.);
                break;
            default:
                System.out.println("Код не найден");
                return;
        }

        System.out.println(String.format("%s, Стоимость разговора - %.02f", region.get(), price.get() * 10));
    }
}
