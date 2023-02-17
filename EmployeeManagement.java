import java.io.FileWriter;
import java.io.IOException;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Smith", "1001", "Staff", 2000);
        Manager manager1 = new Manager("Alice Johnson", "1002", 3000, 1000);
        Salesperson salesperson1 = new Salesperson("Bob Brown", "1003", 2500, 500);
        SoftwareEngineer softwareEngineer1 = new SoftwareEngineer("Sarah Lee", "1004", 3500, 5);

        // Print the details of each employee to the console
        employee1.printDetails();
        manager1.printDetails();
        salesperson1.printDetails();
        softwareEngineer1.printDetails();

        // Write the output to a file named "shun.txt"
        try {
            FileWriter writer = new FileWriter("shun.txt");
            writer.write("Employee Details:\n");
            writer.write("---------------\n");
            writer.write("Name: " + employee1.getName() + "\n");
            writer.write("ID: " + employee1.getId() + "\n");
            writer.write("Position: " + employee1.getPosition() + "\n");
            writer.write("Salary: " + employee1.getSalary() + "\n\n");

            writer.write("Manager Details:\n");
            writer.write("---------------\n");
            writer.write("Name: " + manager1.getName() + "\n");
            writer.write("ID: " + manager1.getId() + "\n");
            writer.write("Position: " + manager1.getPosition() + "\n");
            writer.write("Salary: " + manager1.getSalary() + "\n");
            writer.write("Bonus: " + manager1.getBonus() + "\n\n");

            writer.write("Salesperson Details:\n");
            writer.write("---------------\n");
            writer.write("Name: " + salesperson1.getName() + "\n");
            writer.write("ID: " + salesperson1.getId() + "\n");
            writer.write("Position: " + salesperson1.getPosition() + "\n");
            writer.write("Salary: " + salesperson1.getSalary() + "\n");
            writer.write("Commission: " + salesperson1.getCommission() + "\n\n");

            writer.write("Software Engineer Details:\n");
            writer.write("---------------\n");
            writer.write("Name: " + softwareEngineer1.getName() + "\n");
            writer.write("ID: " + softwareEngineer1.getId() + "\n");
            writer.write("Position: " + softwareEngineer1.getPosition() + "\n");
            writer.write("Salary: " + softwareEngineer1.getSalary() + "\n");
            writer.write("Years of experience: " + softwareEngineer1.getYearsOfExperience() + "\n\n");

            writer.close();
            System.out.println("Output written to shun.txt");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
