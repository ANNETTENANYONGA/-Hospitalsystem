
package com.hospital.records;

public class AdministrationDepartment {

    public void ShowFinanceInfo() {
        Patient P = new Patient();

        System.out.println("FinancialRecord" + " " + P.FinancialRecord);
        System.out.println("PatientName" + " " + P.PatientName);
    }
}