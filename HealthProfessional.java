public class HealthProfessional {
    protected int ID;
    protected String name;
    protected String description;

    // Default constructor
    public HealthProfessional() {
    }

    // Constructor with parameters
    public HealthProfessional(int ID, String name, String description) {
        this.ID = ID;
        this.name = name;
        this.description = description;
    }

    // Method for printing details of health professionals
    public void printDetails() {
        System.out.println("ID: " + ID + ", Name: " + name + ", Description: " + description);
    }
}
