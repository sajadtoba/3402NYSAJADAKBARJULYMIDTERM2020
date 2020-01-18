package design;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EmployeeInfo1 extends AbstractEmployee1 implements Employee1 {   // This is my Concreate Class

    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */

    /*
     * declare few static and final fields and some non-static fields
     */
    //static String companyName;
    //...............................Ist:  we work on private variables

    private String name;
    private int employeeID;
    private String department;
    private int salary;
    private char gender;
    private String dob;

    private static int totalNumOfEmployees;

    /*
     * You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.
     */

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */
    // 1st Constructor     ...................Access modifier and Class Name

    public EmployeeInfo1(int employeeId) {                           // .................. I need to look
        this.employeeID = employeeId;

    }
// 2nd Constructors with name and ID

    public EmployeeInfo1(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }
    // 3rd Constructors

    public EmployeeInfo1(String name, int employeeID, String department, int salary, char gender, String dob) {
        this.name = name;
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
        this.dob = dob;
    }
    //...................................Constructors ...................are done......................


    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public static void setTotalNumOfEmployees(int totalNumOfEmployees) {
        EmployeeInfo1.totalNumOfEmployees = totalNumOfEmployees;
    }

    //...........................Setters.....................done


    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {          //***************         Salary   Setter*************
        return salary;
    }

    public char getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public static int getTotalNumOfEmployees() {
        return totalNumOfEmployees;
    }
    //..................................Getters........................done
    //................Time to implement the interface.................................


    @Override                           //......................
    public int employeeId() {
        return employeeID;
    }
    @Override
    public String employeeName() {         // ..........***************...........
        return name;
    }
    @Override                     //.....................
    public void assignDepartment(String dept) {
        department = department;
    }

    @Override                //***************         Salary  ************* Return   Getter
    public int calculateSalary() {
        return salary;
    }

    @Override   //......
    public void benefitLayout() {
        System.out.println("The benefit layout  " + getSalary()+ "of salary and "+ calculateEmployeePension()+" /on top of 50 stock"); // ................
    }


    @Override
    public void bonus() {

    }

    @Override
    public int age(String dob) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");   //  method and initialized constructor signature

        Date d = null;        // declare variable and variable has no value then we can initialize with null

        try{
            d= sdf.parse(dob);

        }catch (ParseException ex){
            ex.printStackTrace();
        }
        Calendar c = Calendar.getInstance();          // ......................
        c.setTime(d);
        int year  = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date   = c.get(Calendar.DATE);
        LocalDate l1 = LocalDate.of(year,month,date);
        LocalDate now1 = LocalDate.now();
        Period diff1 = Period.between(l1,now1);

        return diff1.getYears();
    }   // Belong to age method

    //.......................Now Time to extends the Class:   AbstractEmploye1 .. or any name into Concrete Class....
    @Override
    public double overTimeCalculation(int extraHours) {
        return extraHours *  90;
    }


    public static int stockOptions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of years the employee has been with the co:");
        int years = sc.nextInt();
        int stockOpt = years * 50;
        System.out.println("The employee has an option of "+ stockOpt + " stocks.");

        sc.close();
        return stockOpt;
    }

    // Creating a Return Method with two arguments   giving 2 arguments performance and salary

    public static double calculateEmployeeBonus(int performance, double salary) {

        double totalBonus = 0.0;

        if (performance == 5) {
            totalBonus = salary * 0.1;  // 10%  equal 0.1
        } else if (performance >= 4) {
            totalBonus = salary * 0.08; // 8%
        } else if (performance >= 3) {
            totalBonus = salary * 0.06;      //6%
        } else if (performance >= 2) {
            totalBonus = 0;
            System.out.println("Need to improve to get bonus");
        } else {
            totalBonus = 0;
            System.out.println("Need to work hard");
        }
        return totalBonus;
    }

    //  Time to calculate the Pension:

    public int calculateEmployeePension() {

        int total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format(example: may,2019): ");
        // Date..........******** Date
        String joiningDate  = sc.nextLine();
        System.out.println("Please enter today data in format(example: Jan,2020): ");

        String todaysDate = sc.nextLine();

        String convertedJoiningDate =DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);


        //implement numbers of year from above two days

        String startYear = convertedJoiningDate.substring(convertedJoiningDate.length()- 4,convertedJoiningDate.length());
        String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length()-4,convertedTodaysDate.length());

        int start = Integer.parseInt(startYear);
        int current = Integer.parseInt(currentYear);


        // Calculate Pension
        int numOfYears = current-start;

        if(numOfYears >= 5){
            total = (int)(salary * .25);
        }else if (numOfYears >= 4){
            total = (int)(salary * .20);
        } else if(numOfYears >=3){
            total = (int)(salary * .15);
        } else if (numOfYears>=2){
            total = (int)(salary * .10);
        }else if(numOfYears>=1){
            total = (int)(salary *.05);
        }else if(numOfYears==0){
            total =0;
        }
        return total=0;

    }
    public void employeeSummary(){
        System.out.println("Employee with ID:"+employeeID+"is"+name+  "," +department+  ","+age(dob) + " ");
    }

    public static int employeeCount(){
        System.out.println("A total of " +totalNumOfEmployees+ "employee work for the co");
        return totalNumOfEmployees;
    }









//  Another Class already inside one class
    private static class DateConversion {

        public DateConversion(Months months){}
        public static String convertDate(String date) {
            String [] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 1;
                    break;
                case August:
                    date = 1;
                    break;
                case September:
                    date = 1;
                    break;
                case October:
                    date = 1;
                    break;
                case November:
                    date = 1;
                    break;
                case December:
                    date = 1;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }




}  // this belong to class
