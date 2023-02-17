public class Manager extends Employee {
    private double bonus;

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, "Manager", salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Override the printDetails method to include the bonus
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Bonus: " + bonus);
    }
}
