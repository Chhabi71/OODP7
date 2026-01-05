package case1;

public class Doctor extends Person {

    private String doctorID;
    private String department;

    public Doctor(String personID, String name, int age, String gender,
                  String address, String contactDetails,
                  String doctorID, String department) {

        super(personID, name, age, gender, address, contactDetails);
        this.doctorID = doctorID;
        this.department = department;
    }

    public void seePatientDetails(Patient patient) {
        System.out.println("Viewing patient details:");
        patient.viewPersonalDetails();
    }

    public Treatment prescribeTreatment(String treatmentID,
                                         String type,
                                         String description) {

        System.out.println("Treatment prescribed.");
        return new Treatment(treatmentID, type, description);
    }
}
