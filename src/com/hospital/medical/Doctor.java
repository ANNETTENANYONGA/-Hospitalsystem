package com.hospital.medical;

import com.hospital.records.Patient;

public class Doctor extends Patient {

    public void ShowDoctorAccess(Patient P) {
        System.out.println("PatientName" + " " + P.PatientName);
        System.out.println("AppointmentDate" + " " + P.getAppointmentDate());
        P.ShowMedicalHistory();
    }

    public void UpdatePatientMedicalInfo(Patient P, String newHistory) {
        P.UpdateMedicalHistory(newHistory);
    }
}