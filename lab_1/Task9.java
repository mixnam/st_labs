package lab_1;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        Integer[] arr = {15,10,51, 6, 5,3, 10,-34,0,32,56, 12,24, 52};

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
