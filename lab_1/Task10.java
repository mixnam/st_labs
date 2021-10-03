package lab_1;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        Integer[] arr = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52};

        int i = 0;
        int swapGap = 0;

        while (i < arr.length) {
            if (arr[i] == 0) {
                swapGap++;
            } else {
                int tmp = arr[i - swapGap];
                arr[i - swapGap] = arr[i];
                arr[i] = tmp;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
