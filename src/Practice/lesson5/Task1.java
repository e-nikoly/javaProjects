/**
 * 1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
 * задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 *
 */
package Practice.lesson5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Green");
        car.setModel("Audi");
        car.setYear(2022);

        System.out.println("Автомобиль марки " + car.getModel() + " цвете "
        + car.getColor() + " года выпуска " + car.getYear());

    }
}
