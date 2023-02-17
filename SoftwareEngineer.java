public class SoftwareEngineer extends Employee {
    private int yearsOfExperience;

    public SoftwareEngineer(String name, String id, double salary, int yearsOfExperience) {
        super(name, id, "Software Engineer", salary);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    // Override the printDetails method to include the years of experience
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Years of experience: " + yearsOfExperience);
    }
}