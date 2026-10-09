import com.hospital.records.Patient;
import com.hospital.medical.Doctor;
import com.hospital.reception.Receptionist;
import com.hospital.records.AdministrationDepartment;

public class Main {

    public static void main(String[] args) {
        Patient P = new Patient();
        Doctor D = new Doctor();
        Receptionist R = new Receptionist();
        AdministrationDepartment A = new AdministrationDepartment();

        System.out.println(" RECEPTIONIST VIEW ");
        R.ShowReceptionistAccess(P);

        System.out.println("\n DOCTOR VIEW ");
        D.ShowDoctorAccess(P);

        System.out.println("\n ADMIN VIEW ");
        A.ShowFinanceInfo();

        System.out.println("\n DOCTOR UPDATES ");
        D.UpdatePatientMedicalInfo(P, "Malaria - Treated");
        System.out.println("Updated History: " +" " + P.getMedicalHistory());
    }
}