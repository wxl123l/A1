public class HealthProfessional {
    protected int ID;
    protected String name;
    protected String description;

    public HealthProfessional() {
    }

    public HealthProfessional(int ID, String name, String description) {
        this.ID = ID;
        this.name = name;
        this.description = description;
    }

    public void printDetails() {
        System.out.println("ID: " + ID + ", Name: " + name + ", Description: " + description);
    }
}
