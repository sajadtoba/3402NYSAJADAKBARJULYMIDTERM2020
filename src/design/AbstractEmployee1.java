package design;

public abstract class AbstractEmployee1 implements Employee1 {

    final static String companyName = "SquareDeal";


    // We can declare the abstract Methods and also implements the methods....................

    public abstract double overTimeCalculation (int extraHours);       //  only declared abstract mehtod but we must need java key word Abstract after the access modifier



    public static double calculateSalary (int salary, double bonus){
        return salary + bonus;
    }
    // implements another Method
    public static void performance() {
        System.out.println("Performance is measured according to their correspondence");
    }

    public  void performance (String rating) {
        System.out.println("The employee performance is consider"+ rating);
    }
    public static void companysize() {
        System.out.println(companyName + " has a total "+ EmployeeInfo.getTotalNumOfEmployees());
    }






}
