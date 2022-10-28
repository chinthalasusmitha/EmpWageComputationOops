package empwagecomputation;

import java.util.Random;

public class MainClass {
//    EmpWageComputationMethod = new EmpWageComputationMethod();

    //    public static void totalEmpWage() {
    public static void main(String[] args) {
        Random random = new Random();
        EmpWageComputationMethod employee = new EmpWageComputationMethod();

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int empHrs = 0;

        while ((totalWorkingDays < 20) && (totalWorkingHours < 100)) {

            totalWorkingDays++;
            int empCheck = random.nextInt(3);
            switch (empCheck) {

                case 1:

                    EmpWageComputationMethod.getIS_PART_TIME();
                    empHrs = 4;
                    System.out.println("Display Part time");
                    break;
                case 2:
                    EmpWageComputationMethod.getIS_FULL_TIME();
                    empHrs = 8;
                    System.out.println("Display full time");

                    break;
                default:
                    empHrs = 0;
                    System.out.println("Display default time");


            }
            totalWorkingHours = empHrs + totalWorkingHours;
            empWage = empHrs * employee.getEmpRatePerHour();
            System.out.println("day " + totalWorkingDays + " = " + empWage);
            totalEmpWage = empWage + totalEmpWage;
            employee.getEmpRatePerHour();
            System.out.println(employee.toString());

            employee.setCompany("wipro");
            System.out.println("salary of " + employee.getCompany() + " employee is " + totalEmpWage);

        }
    }
}

//
//    private static void employee(String dMArt, int i, int i1, int i2) {
//
//
//        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
//        employee("dMArt", 20, 2, 10);
//        employee("Reliance", 30, 4, 14);
//
//    }
//}


//    public static void main(String[] args) {
//        EmpWageComputationMethod dMart = new EmpWageComputationMethod("dMart", 20, 20, 100);
//     dMart.totalEmpWage();
//     EmpWageComputationMethod cipro = new EmpWageComputationMethod("Cipro", 25, 15, 100);
//    cipro.totalEmpWage();
//    }


