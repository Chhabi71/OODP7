package case1;

public class Appointment {

    private String appointmentID;
    private String appointmentDate;
    private String appointmentTime;
    private Patient patient;
    private Doctor doctor;

    public Appointment(String appointmentID, String appointmentDate,
                       String appointmentTime, Patient patient, Doctor doctor) {

        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.patient = patient;
        this.doctor = doctor;
    }

    public void rescheduleAppointment(String newDate, String newTime) {
        this.appointmentDate = newDate;
        this.appointmentTime = newTime;
        System.out.println("Appointment rescheduled.");
    }

    public void cancelAppointment() {
        System.out.println("Appointment cancelled.");
    }

    public void viewAppointmentDetails() {
        System.out.println("\n--- Appointment Details ---");
        System.out.println("Appointment ID: " + appointmentID);
        System.out.println("Date: " + appointmentDate);
        System.out.println("Time: " + appointmentTime);
        System.out.println("Patient: " + patient.name);
        System.out.println("Doctor: " + doctor.name);
    }
}
