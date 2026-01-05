package case1;

public class Main {

    public static void main(String[] args) {

        Doctor d = new Doctor("P101","Dr. Dre",45,"Male",
                "Kathmandu","987654321","D10","Cardiology");

        Patient p = new Patient("P201","Chhabi",21,"Male",
                "Lalitpur","981111111","PT15");

        Appointment ap = p.bookAppointment(d,
                "A1","2026-01-10","10:00 AM");

        ap.viewAppointmentDetails();

        Treatment t = d.prescribeTreatment("T1","Medicine",
                "Take two daily");

        t.viewTreatmentDetails();
    }
}
