/**
 * 2. Реализовать программу, которая пока работает, принимает на вход от пользователя
 * два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
 * результат деления и выводит его в консоль. Программа останавливает свою работу
 * тогда, когда пользователь вводит 0 в качестве делителя.
 * (для этих вещественных чисел необходимо использовать тип double и метод
 * nextDouble()у Scanner’а соответственно).
 *
 *
 */

package Practice.lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double divisible = 0.0;
        double divider = -1.0;

        while (divider != 0){
            divisible = sc.nextDouble();
            divider = sc.nextDouble();

            if (divider != 0){
                System.out.println(divisible/divider);
            } else System.out.println("Программа завершает работу");


        }

    }
}
