package com.hospital.reception;

import com.hospital.records.Patient;

public class Receptionist {

    public void ShowReceptionistAccess(Patient P) {
        System.out.println("PatientName " + " " + P.PatientName);
        System.out.println("AppointmentDate " + " " + P.getAppointmentDate());
    }
}