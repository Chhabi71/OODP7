package case1;

public class Patient extends Person {

    private String patientID;

    public Patient(String personID, String name, int age, String gender,
                   String address, String contactDetails, String patientID) {

        super(personID, name, age, gender, address, contactDetails);
        this.patientID = patientID;
    }


    public Appointment bookAppointment(Doctor doctor, String appointmentID,
                                       String date, String time) {

        Appointment appointment =
                new Appointment(appointmentID, date, time, this, doctor);

        System.out.println("Appointment booked successfully.");
        return appointment;
    }

    public String getPatientID() {
        return patientID;
    }
}
