import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("Part 3 – Using classes and objects");

        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Practice", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "General Practice", "Internal Medicine");
        Specialist specialist1 = new Specialist(3, "Dr. Williams", "Cardiology", "Heart Diseases");
        Specialist specialist2 = new Specialist(4, "Dr. Brown", "Dermatology", "Skin Diseases");

        gp1.printDetails();
        gp2.printDetails();
        specialist1.printDetails();
        specialist2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("Part 5 – Collection of appointments");
        ArrayList<Appointment> appointments = new ArrayList<>();

        createAppointment(appointments, "John Doe", "1234567890", "08:00", gp1);
        createAppointment(appointments, "Jane Doe", "0987654321", "10:00", gp2);
        createAppointment(appointments, "Alice Smith", "1122334455", "14:30", specialist1);
        createAppointment(appointments, "Bob Johnson", "5544332211", "16:00", specialist2);

        printExistingAppointments(appointments);

        cancelBooking(appointments, "0987654321");

        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }

    // Method for creating an appointment
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName,
                                         String mobilePhone, String timeSlot, HealthProfessional doctor) {
        Appointment newAppointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
        appointments.add(newAppointment);
        System.out.println("Appointment created for: " + patientName);
    }

    // Method for printing existing reservations
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Existing Appointments:");
            for (Appointment appointment : appointments) {
                appointment.printDetails();
            }
        }
    }

    // Method for Canceling an Appointment
    public static void cancelBooking(ArrayList<Appointment> appointments, String mobilePhone) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).mobilePhone.equals(mobilePhone)) {
                System.out.println("Cancelling appointment for: " + appointments.get(i).patientName);
                appointments.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found for mobile phone: " + mobilePhone);
        }
    }
}

