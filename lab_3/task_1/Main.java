package lab_3.task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Flower[][] bukets = {
            {
                new Rose(), new Rose(), new Rose()
            },
            {
                new Romashka(), new Rose(), new Gvosdika(), new Tulpan()
            },
            {
                new Romashka(), new Romashka(), new Romashka()
            }
        };

        for (Flower[] b: bukets) {
            System.out.println("Цена букета:");
            System.out.println(Main.getBucketPrice(b));
        }

        System.out.println("Кол-во проданых цветов:");
        System.out.println(Main.soldFlowerscount(bukets));
    }

    static int getBucketPrice(Flower[] bucket) {
        return Arrays.stream(bucket).map(x -> x.getPrice()).reduce((x, y) -> x + y).get();
    }

    static int soldFlowerscount(Flower[][] buckets) {
        return Arrays.stream(buckets).map(x -> x.length).reduce((x, y) -> x + y).get();
    }
}
