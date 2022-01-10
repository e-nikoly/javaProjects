/**
 * 2. Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Затем, используя циклы for each вывести:
 * - наибольший элемент массива
 * - наименьший элемент массива
 * - количество элементов массива, оканчивающихся на 0
 * - сумму элементов массива, оканчивающихся на 0
 *
 * Использовать сортировку запрещено.
 */
package Practice.lesson4;


import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[100];

        int sum = 0;
        int max = 0;
        int min = 10_000;
        int x0 = 0;
        int xoSum = 0;

        for (int i = 0; i<arr.length; i++){
            arr[i] = rand.nextInt(10000);
        }
        for (int x:arr) {
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
            if (x%10 == 0){
                x0++;
                xoSum += x;
            }

        }
        System.out.println("наибольший элемент массива " + max);
        System.out.println("наименьший элемент массива " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0 " + x0);
        System.out.println("сумма элементов массива, оканчивающихся на 0 " + xoSum);




    }
}
