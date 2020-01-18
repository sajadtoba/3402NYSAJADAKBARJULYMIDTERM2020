package design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FortuneEmployee1 {
    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     **/
    public static void main(String[] args) {

        EmployeeInfo1 e1 = new EmployeeInfo1("Sajad Akbar", 001, "QA", 85000, 'M', "1960/01/01");
        EmployeeInfo1 e2 = new EmployeeInfo1("Fahim Khan", 002, "DEV", 95000, 'M', "1960/01/02");
        EmployeeInfo1 e3 = new EmployeeInfo1("Sahra Ahmad", 003, "QA", 96000, 'M', "1960/01/03");
        EmployeeInfo1 e4 = new EmployeeInfo1("Samina Sheikh", 004, "QA", 86000, 'F', "1970/01/01");
        EmployeeInfo1 e5 = new EmployeeInfo1("John Smith", 005, "DEV", 98000, 'M', "1950/02/02");

        EmployeeInfo1 e6 = new EmployeeInfo1("Mr.Chen", 006);

        e6.setDepartment("Finance");
        e6.setDob("1978/02/03");
        e6.setGender('M');
        e6.setSalary(90000);

        System.out.println(e6.getName());
        System.out.println(e6.getSalary());
        System.out.println(e6.getGender());

        EmployeeInfo1.setTotalNumOfEmployees(2);
        System.out.println(EmployeeInfo1.getTotalNumOfEmployees());



        EmployeeInfo e7 = new EmployeeInfo(007);
        e7.setName("Spider Man");
        e7.setEmployeeID(200);
        e7.assignDepartment("Developer");
        e7.setSalary(960000);
        e7.benefitLayout();

       //********************    e7             ****************************

        System.out.print(e7.employeeId());   // i removed println to ln
        System.out.print(e7.employeeName());
        System.out.print(e7.calculateSalary());

        //******************     e8                          **************

        AbstractEmployee1 e8 = new EmployeeInfo1(002);
        e8.overTimeCalculation(4);
        AbstractEmployee1.performance();
        e8.performance("B");
        //e8.age("1988/09/09");     //.............************************
        System.out.println("");


        //**********************  e1                   *********************

        System.out.print(e1.getEmployeeID()); // I removed all three println to ln
        System.out.print(e1.getDepartment());
        System.out.print(e1.getDob());
        System.out.print(e1.age("1980/06/20"));

        e1.employeeSummary();
        EmployeeInfo1.employeeCount();
        System.out.println("");
        System.out.println("The employee would receive"+ e1.calculateEmployeePension()+ "Pension");
        System.out.println("");
        System.out.println(EmployeeInfo1.calculateEmployeeBonus(4,100000));
        System.out.println("");
        e1.calculateEmployeePension();
        System.out.println(EmployeeInfo1.getTotalNumOfEmployees());
        System.out.println(AbstractEmployee1.calculateSalary(90000,80000));
        AbstractEmployee1.companysize();

        //****************************    *******************************

        Map<Integer, List<Object>> employeeInFo1 = new HashMap<Integer, List<Object>>();
        List<Object> emp1 = new ArrayList<Object>();
        emp1.add(e1.employeeName());
        emp1.add(e1.employeeId());
        emp1.add(e1.calculateSalary());

        List<Object> emp2 = new ArrayList<Object>();
        emp2.add(e2.employeeName());
        emp2.add(e2.employeeId());
        emp2.add(e2.calculateSalary());

        List<Object> emp3 = new ArrayList<Object>();
        emp2.add(e3.employeeName());
        emp2.add(e3.employeeId());
        emp2.add(e3.calculateSalary());


        employeeInFo1.put(1, emp1);
        employeeInFo1.put(2, emp2);
        employeeInFo1.put(3, emp3);

        List empInfo = new ArrayList();
        empInfo = emp2;

//        ConnectToSqlDB connect = new ConnectToSqlDB();
//        ConnectToSqlDB.connectToSqlDatabase();
//
//        connect.createTableFromStringToMySql("Employee_Records","Emp_Info");
//
//        connect.insertDataFromArrayListToSqlTable(empInfo, "Employee_Records","Emp_Info");
//
//        //converting List<Object> to List<String>
//        List<String> stringList = new ArrayList<String>();
//        List<Object> objectList = Arrays.asList(stringList.toArray());
//
//        connect.readDataBase("Employee_Records","Emp_Info");



    }

}
