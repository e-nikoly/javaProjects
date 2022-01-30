package Practice.lesson11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse war1 = new Warehouse();
        Picker pic1 = new Picker(war1);
        Courier cour1 = new Courier(war1);

        for (int i = 0; i<1500; i++) {
            pic1.doWork();
            pic1.bonus();
            cour1.doWork();
            cour1.bonus();
        }

        System.out.println(pic1.getSalary());
        System.out.println(cour1.getSalary());
        System.out.println(war1.toString());

        Warehouse war2 = new Warehouse();
        Picker pic2 = new Picker(war2);
        Courier cour2 = new Courier(war2);

        for (int i = 0; i<1000; i++) {
            pic2.doWork();
            pic2.bonus();
            cour2.doWork();
            cour2.bonus();
        }

        System.out.println(pic2.getSalary());
        System.out.println(cour2.getSalary());
        System.out.println(war2.toString());
    }
}
