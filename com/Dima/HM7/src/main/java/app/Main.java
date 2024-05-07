package app;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] array = new int[20];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        int sumOfNegative = 0;
        for(int num : array) {
            if (num <0) {
                sumOfNegative += num;
            }
        }
        System.out.println("Сумма всех отрицательных чисел в массиве: " + sumOfNegative);

        int countEven = 0;
        int countOdd = 0;
        for(int num : array) {
            if(num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Количество четных чисел в массиве: " + countEven);
        System.out.println("Количество нечетных чисел в массиве: " + countOdd);

        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Наибольший элемент массива: " + max + " (с индексом " + maxIndex + ")");
        System.out.println("Наименьший элемент массива: " + min + " (с индексом " + minIndex+ ")");

        int sumAfterFirstNegative = 0;
        int countAfterFirstNegative = 0;
        boolean foundFirstNegative = false;
        for (int i = 0; i < array.length; i++) {
            if (foundFirstNegative) {
                sumAfterFirstNegative += array[i];
                countAfterFirstNegative++;
            }
            if (!foundFirstNegative && array[i] < 0) {
                foundFirstNegative = true;
            }
        }
        if (countAfterFirstNegative > 0) {
            double averageAfterFirstNegative = (double) sumAfterFirstNegative / countAfterFirstNegative;
            System.out.println("Среднее арифметическое чисел после первого отрицательного числа: " + averageAfterFirstNegative);
        } else {
            System.out.println("В массиве нет отрицательных чисел, поэтому среднее арифметическое чисел после первого отрицательного не может быть вычислено.");
        }
    }
}
