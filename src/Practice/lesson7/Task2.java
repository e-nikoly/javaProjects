package Practice.lesson7;

public class Task2 {
    public static void main(String[] args) {
        Plyer plyer1 = new Plyer();
        plyer1.info();
        Plyer plyer2 = new Plyer();
        plyer1.info();
        Plyer plyer3 = new Plyer();
        plyer1.info();
        Plyer plyer4 = new Plyer();
        plyer1.info();
        Plyer plyer5 = new Plyer();
        plyer1.info();
        Plyer plyer6 = new Plyer();
        plyer1.info();
        System.out.println(plyer1.getStamina());
        for (int i = 0; i<100; i++) {
            plyer1.run();
        }
        System.out.println(plyer1.getStamina());
        plyer1.info();

    }
}
