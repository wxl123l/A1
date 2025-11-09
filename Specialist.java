public class Specialist extends HealthProfessional {
    private String expertise;

    public Specialist() {
    }

    public Specialist(int ID, String name, String description, String expertise) {
        super(ID, name, description);
        this.expertise = expertise;
    }

    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        System.out.println("Type: Specialist, ID: " + ID + ", Name: " + name +
                ", Description: " + description + ", Expertise: " + expertise);
    }
}