/**
 * 1. Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня
 * в пакет текущего дня.
 *
 * В классах Автомобиль и Мотоцикл реализовать два метода:
 * info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * yearDifference() - принимает на вход число (год), и возвращает разницу между
 * переданным годом и годом выпуска транспортного средства
 */
package Practice.lesson6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setModel("Audi");
        car.setYear(1986);
        car.info();
        System.out.println(car.yearDifference(2022));

        Motorbike motorbike = new Motorbike(1990, "Yellow", "Suzuki");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2022));


    }
}
