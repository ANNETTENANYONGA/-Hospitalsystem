
package com.hospital.records;

public class Patient {
    private String MedicalHistory;
    private String Department;
    public String PatientName;
    String FinancialRecord;
    protected String AppointmentDate;

    // Initialize patient information
    {
        MedicalHistory = "Malaria - Confidential";
        Department = "General Ward";
        PatientName = "NANYONGA ANNET";
        FinancialRecord = "Bill: 500000 UGX - Paid";
        AppointmentDate = "05-Oct-2026";
    }

    public void ShowPatientInfo() {
        System.out.println("PatientName" + " " + PatientName);
        System.out.println("Department" + " " + Department);
        System.out.println("MedicalHistory" + " " + MedicalHistory);
        System.out.println("FinancialRecord" + " " + FinancialRecord);
        System.out.println("AppointmentDate" + " " + AppointmentDate);
    }

    public String getMedicalHistory() {
        return MedicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        MedicalHistory = medicalHistory;
    }

    public String getAppointmentDate() {
        return AppointmentDate;
    }

    public String getFinancialRecord() {
        return FinancialRecord;
    }

    public void ShowMedicalHistory() {
        System.out.println("Medical History" +  " " + MedicalHistory);
    }

    public void UpdateMedicalHistory(String newHistory) {
        MedicalHistory = newHistory;
    }
}