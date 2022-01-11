package Practice.lesson6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    Motorbike(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;

    }
    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int yearCurrent){
        int yearCom = yearCurrent - year;
        return yearCom;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

}
