/**
 * 1. Реализовать программу, которая принимает на вход через консоль с помощью
 * класса Scanner, число, соответствующее количеству этажей в здании. Используя
 * условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.
 *
 * Условия: если этажей 1-4  - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более
 * - “Многоэтажный дом”. Так же, необходимо учесть что может быть введено
 * отрицательное значение, в таком случае сообщить “Ошибка ввода”.
 */

package Practice.lesson2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество этажей в доме:");
        int in = sc.nextInt();
        if (in>=1 && in<=4){
            System.out.println("Малоэтажный дом");
        } else if (in>=5 && in<=8){
            System.out.println("Среднеэтажный дом");
        } else if (in>=9){
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }


    }
}
