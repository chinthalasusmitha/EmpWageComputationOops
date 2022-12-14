package empwagecomputation;

public class EmpWageComputationMethod {
    private static int IS_PART_TIME = 4;
    private static int IS_FULL_TIME = 8;

    private String company;
    private int empRatePerHour = 100;
    private int numOfWorkingDays = 20;
    private int maxHoursPerMonth;
//    public EmpWageComputationMethod(){
//
//    }
    public EmpWageComputationMethod(String company, int empRatePerHour,
                                    int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public EmpWageComputationMethod() {

    }

    public static int getIS_PART_TIME() {
        return IS_PART_TIME;
    }

    public static int getIS_FULL_TIME() {
        return IS_FULL_TIME;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getEmpRatePerHour() {
        return empRatePerHour;
    }

    public void setEmpRatePerHour(int empRatePerHour) {
        this.empRatePerHour = empRatePerHour;
    }

    public int getNumOfWorkingDays() {
        return numOfWorkingDays;
    }

    public void setNumOfWorkingDays(int numOfWorkingDays) {
        this.numOfWorkingDays = numOfWorkingDays;
    }

    public int getMaxHoursPerMonth() {
        return maxHoursPerMonth;
    }

    public void setMaxHoursPerMonth(int maxHoursPerMonth) {
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    @Override
    public String toString() {
        return "EmpWageComputationMethod{" +
                "company='" + company + '\'' +
                ", empRatePerHour=" + empRatePerHour +
                ", numOfWorkingDays=" + numOfWorkingDays +
                ", maxHoursPerMonth=" + maxHoursPerMonth +
                '}';
    }
}


