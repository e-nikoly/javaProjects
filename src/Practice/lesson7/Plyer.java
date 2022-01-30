package Practice.lesson7;

import java.util.Random;

public class Plyer {
    public int getStamina() {
        return stamina;
    }

    public Plyer() {
        Random rand = new Random();
        this.stamina = rand.nextInt(11) + 90;
        if (countPlayers <  6) countPlayers++;

    }

    private int stamina;
    public final int MAX_STAMINA = 100;
    public final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public void run(){
        if (stamina > MIN_STAMINA) this.stamina--;
        else if (stamina == MIN_STAMINA) countPlayers--;
        System.out.println(stamina);


    }
    public void info(){
        if (countPlayers < 6){
            System.out.println("Команды неполные. На поле еще есть " +
                    (6 - countPlayers) + " свободных мест");
        } else System.out.println("на поле нет свободных мест");
    }
}
