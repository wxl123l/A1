public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    public GeneralPractitioner() {
    }

    public GeneralPractitioner(int ID, String name, String description, String specialty) {
        super(ID, name, description);
        this.specialty = specialty;
    }

    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        System.out.println("Type: General Practitioner, ID: " + ID + ", Name: " + name +
                ", Description: " + description + ", Specialty: " + specialty);
    }
}
