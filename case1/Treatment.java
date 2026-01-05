package case1;

public class Treatment {

    private String treatmentID;
    private String type;
    private String description;

    public Treatment(String treatmentID, String type, String description) {
        this.treatmentID = treatmentID;
        this.type = type;
        this.description = description;
    }

    public void updateDescription(String description) {
        this.description = description;
    }

    public void viewTreatmentDetails() {
        System.out.println("\n--- Treatment Details ---");
        System.out.println("Treatment ID: " + treatmentID);
        System.out.println("Type: " + type);
        System.out.println("Description: " + description);
    }
}
