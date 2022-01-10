/**
 * 3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
 * матрицы задать m=12, n=8 (m- размерность по строкам, n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
 * строк несколько, вывести индекс последней из них.
 *
 */
package Practice.lesson4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int [][] arr = new int[12][8];
        int[] sum = new int[12];
        int k = 0;
        int a = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = rand.nextInt(50);
                System.out.print(arr[i][j] + " ");
                sum[i] += arr[i][j];
            }
            if (sum[i]>=k){
                k = sum[i];
                a=i;
            }
            System.out.println();
        }
        System.out.println(a);
    }
}
