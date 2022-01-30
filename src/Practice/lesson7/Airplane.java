package Practice.lesson7;

public class Airplane {
    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public String getProducer() {
        return producer;
    }

    public int getLength() {
        return length;
    }

    public int getFuel() {
        return fuel;
    }

    public void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " +
                year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int fuel){
        this.fuel += fuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.getLength() > airplane2.getLength()) System.out.println("самолет " + airplane1.getProducer() + " длинее");
        else if (airplane1.getLength() < airplane2.getLength()) System.out.println("самолет " + airplane2.getProducer() + " длинее");
        else System.out.println("самолеты равны");
    }


}
