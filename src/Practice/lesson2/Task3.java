/**
 * 3. Реализовать программу №2, используя цикл while.
 */

package Practice.lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите а = ");
        int a = sc.nextInt();
        System.out.print("Введите в = ");
        int b = sc.nextInt();

        int i = a + 1;
        if (i >= b){
            System.out.println("Некорректный ввод");
        }
        else{
            while(i <= b){
                if(i % 5 == 0 && i % 10 != 0){
                    System.out.print(i + " ");
                }
            i++;
            }

        }


    }
}
