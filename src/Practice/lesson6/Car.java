package Practice.lesson6;

public class Car {
    private int year;
    private String color;
    private String model;

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int yearCurrent) {
        int yearCom = yearCurrent - year;
        return yearCom;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
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
