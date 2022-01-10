/**
 * 4. Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
 * максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 *
 */
package Practice.lesson4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int [] arr = new int[100];

        int k = 0;
        int sum = 0;


        for (int a = 0; a < arr.length; a++) {
            arr[a] = rand.nextInt(10000);
        }

        for (int i = 0; i < arr.length-2; i++){
           int sum3 = 0;
            for (int j = 0; j < 3; j++){
                sum3 += arr[i+j];
            }
            if (sum3 > sum){
                sum = sum3;
                k=i;

            }
        }
        System.out.println(sum);
        System.out.println(k);
    }
}
