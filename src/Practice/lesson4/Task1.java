/**
 * 1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
 * указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
 * содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 */
package Practice.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n = sc.nextInt();
        int n8=0;
        int n1=0;
        int even=0;
        int odd=0;
        int sum=0;

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(10);
            if (arr[i]>8){
                n8++;
            } else if (arr[i]==1){
                n1++;
            }

            if(arr[i]%2 == 0){
                even++;
            }else {
                odd++;
            }

            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("длина массива " + arr.length);
        System.out.println("Количество чисел больше 8 " + n8);
        System.out.println("Количество чисел равных 1 " + n1);
        System.out.println("Количестве четных чисел " + even);
        System.out.println("Количестве нечетных чисел " + odd);
        System.out.println("Сумме всех элементов массива " + sum);

    }
}
