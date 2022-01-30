package Practice.lesson7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("boing", 2020, 40, 5);
        Airplane airplane2 = new Airplane("ty", 2021, 40, 5);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
