public class Employee {
    private String name;
    private String id;
    private String position;
    private double salary;

    public Employee(String name, String id, String position, double salary) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.salary = salary;
    }

    // Getters and setters for the private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // A method to print the details of an employee
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}