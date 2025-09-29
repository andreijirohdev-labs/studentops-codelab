package dev.andreijiroh.studentops.projects;

/**
 * Computer Programming 1 - 04 Performance Task
 * @author Andrei Jiroh Eugenio Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class ComProgPETA_netPay {
    public static void main(String[] args) {
        String employeeName = "Magdalena Leones";
        long employeeId = 4594910906L;
        int monthlySalary = 35000;

        /**
         * This class stores the static values ffor different percentages on deductions for maintainability.
         */
        class deductionFormula {
            static public double taxRate = 0.12f;
            static public double socialSecurity = 0.045f;
            static public double pagibigContributions = 200f; 
        }

        // this is where the math happens
        double socialSecurity = Math.round((monthlySalary * deductionFormula.socialSecurity) * 100f) / 100f;
        double totalDeductions = socialSecurity + deductionFormula.pagibigContributions;
        double withholdingTax = Math.round(((monthlySalary - totalDeductions) * deductionFormula.taxRate) * 100f / 100f);

        // finally output the reasults as if it's a payslip
        System.out.println("EMPLOYEE PAYSLIP - 2025-09-29");
        System.out.println("Note that all of the amounts are written in PHP (Philippine Peso).");
        System.out.println();
        System.out.println("Name: "+employeeName);
        System.out.println("Employee ID: "+employeeId);
        System.out.println();
        System.out.println("GROSS PAY: "+monthlySalary);
        System.out.println();
        System.out.println("DEDUCTIONS");
        System.out.println("Social security (SSS): "+socialSecurity);
        System.out.println("HDMF / PAG-IBIG Savings: "+deductionFormula.pagibigContributions);
        System.out.println("Total deductions before tax: "+ totalDeductions);
        System.out.println("Withholding tax: "+withholdingTax);
        System.out.println();
        System.out.println("NET PAY: "+ (monthlySalary - totalDeductions - withholdingTax));
    }
}
