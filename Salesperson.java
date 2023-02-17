public class Salesperson extends Employee {
    private double commission;

    public Salesperson(String name, String id, double salary, double commission) {
        super(name, id, "Salesperson", salary);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    // Override the printDetails method to include the commission
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Commission: " + commission);
    }
}