package Practice.lesson11;

public class Courier implements Worker{
    private double salary;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    private Warehouse warehouse;
    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary+=100;
        this.warehouse.setBalance(warehouse.getBalance()+1000);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance()>=1_000_000){
            this.salary = 2 * this.salary;
            warehouse.setBalance(0);
            this.salary = 0;
        }

    }
}
