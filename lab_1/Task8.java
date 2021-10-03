package lab_1;

public class Task8 {
    public static void main(String[] args) {
        Integer[] arr = {1,-10,5,6,45,23, 45,-34,0,32,56,-1,2,-2};

        Integer maxValue = arr[0];
        Integer positiveSum = 0;
        Integer positiveCount = 0;
        Integer negativeSum = 0;
        Integer negativeCount = 0;
        Integer negativeEvenSum = 0;

        for (Integer integer : arr) {
            if (integer > maxValue) {
                maxValue = integer;
            }

            if (integer > 0) {
                positiveSum += integer;
                positiveCount++;
            } else {
                negativeSum += integer;
                negativeCount++;
                if (integer % 2 == 0) {
                    negativeEvenSum += integer;
                }
            }
        }

        System.out.println(String.format("""
        maxValue - %d,
        positiveSum - %d,
        negativeEvenSum - %d,
        positioveCount - %d,
        meanNegativeValue - %f
        """, maxValue, positiveSum, negativeEvenSum, positiveCount, Float.valueOf(negativeSum / negativeCount)));
    }
}
