public class Appointment {
    public String patientName;// Patient's Name
    public String mobilePhone;// Patient's mobile phone number
    private String timeSlot;//Reserve a time slot
    private HealthProfessional doctor;//The scheduled doctor
    public Appointment() {
    }

    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Method for printing appointment details
    public void printDetails() {
        System.out.println("Patient Name: " + patientName + ", Mobile Phone: " + mobilePhone +
                ", Time Slot: " + timeSlot + ", Doctor: " + doctor.name);
    }
}
