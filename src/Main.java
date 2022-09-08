import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        double[] doubleNums = {-3.2, 2.9, -9.0, 2.8, -2.9, 6.7, -3.4, 4.1, -8.9, 1.9, -1.0, 1.2, -5.0, 7.6, -3.9};
//        for (double m : doubleNums) {
//            double resultOfDouble = 0;
//            for (int i = 0; i < doubleNums.length; i++) {
//                resultOfDouble += doubleNums[i];
//                if (doubleNums[i] > 0){
//                    System.out.print(doubleNums[i] /= doubleNums.length);
//                }
//            }
//
//            System.out.println(resultOfDouble);
//        }

        double[] doubleNums = {-3.2, 2.9, -9.0, 2.8, -2.9, 6.7, -3.4, 4.1, -8.9, 1.9, -1.0, 1.2, -5.0, 7.6, -3.9};
        double sum = 0;
        int numbersOfArray = 0;
        boolean checker = false;
        for (double num: doubleNums) {
            if (num < 0){
                checker =true;
            } else if (num > 0 && checker) {
            numbersOfArray++;
            sum += num;
            }

        }

        System.out.println("Average Of Positive Array's Numbers " + (sum / numbersOfArray));




        double x = 0;
        for (int i = 0; i < doubleNums.length; i++) {
            for (int j = 0; j < doubleNums.length; j++) {
                if (doubleNums[i] > doubleNums[j]){
                    doubleNums[j]= x;
                }

            }
            System.out.println(Arrays.toString(doubleNums));
        }






    }


}


