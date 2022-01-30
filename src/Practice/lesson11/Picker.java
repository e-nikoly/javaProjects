package Practice.lesson11;

public class Picker implements Worker {
    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    private double salary;
    private Warehouse warehouse;

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary+=80;

        this.warehouse.setCountOrder(warehouse.getCountOrder()+1);
        }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder()>=1500){
            this.salary = 3 * this.salary;
            warehouse.setCountOrder(0);
            this.salary=0;
        }


    }
}
