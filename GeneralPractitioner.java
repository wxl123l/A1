public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    // Default constructor
    public GeneralPractitioner() {
    }

    // Constructor with parameters
    public GeneralPractitioner(int ID, String name, String description, String specialty) {
        super(ID, name, description);
        this.specialty = specialty;
    }

    // Rewrite the method for printing details
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        System.out.println("Type: General Practitioner, ID: " + ID + ", Name: " + name +
                ", Description: " + description + ", Specialty: " + specialty);
    }
}
