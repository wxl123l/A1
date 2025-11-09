public class Appointment {
    public String patientName;
    public String mobilePhone;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment() {
    }

    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public void printDetails() {
        System.out.println("Patient Name: " + patientName + ", Mobile Phone: " + mobilePhone +
                ", Time Slot: " + timeSlot + ", Doctor: " + doctor.name);
    }
}
