package empwagecomputation;

import java.util.Random;

public class MainClass {
//    EmpWageComputationMethod empWageComputationMethod = new EmpWageComputationMethod();

    //    public static void totalEmpWage() {
    public static void main(String[] args) {
        Random random = new Random();
        EmpWageComputationMethod EmpWageComputationMethod = new EmpWageComputationMethod();

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int empHrs = 0;

        while (totalWorkingDays < EmpWageComputationMethod.getNumOfWorkingDays()
                && totalWorkingHours < EmpWageComputationMethod.getMaxHoursPerMonth()) {
            totalWorkingDays++;
            int empCheck = random.nextInt(3);
            switch (empCheck) {

                case 1:
//                    empHrs = 4;
                    EmpWageComputationMethod.getIS_PART_TIME();
                    break;
                case 2:
//                    IS_FULL_TIME -> empHrs = 8;
                    EmpWageComputationMethod.getIS_FULL_TIME();
                    break;
                default:
                    empHrs = 0;

            }
            totalWorkingHours = empHrs + totalWorkingHours;
            empWage = empHrs * EmpWageComputationMethod.getEmpRatePerHour();
            System.out.println("day " + totalWorkingDays + " = " + empWage);
            totalEmpWage = empWage + totalEmpWage;
            EmpWageComputationMethod.getEmpRatePerHour();
        }
        EmpWageComputationMethod empWageComputationMethod = new EmpWageComputationMethod("Dmart",
                20, 20, 100);
        EmpWageComputationMethod wipro = new EmpWageComputationMethod("wipro", 25,
                15, 100);
        System.out.println(empWageComputationMethod.toString());
//        System.out.println("salary of " + empWageComputationMethod.getCompany()+ " employee is " + totalEmpWage);

    }
}

//    public static void main(String[] args) {
//        EmpWageComputationMethod dMart = new EmpWageComputationMethod("dmart", 20, 20, 100);
//        EmpWageComputationMethod wipro = new EmpWageComputationMethod("wipro", 25, 15, 100);

//    }


