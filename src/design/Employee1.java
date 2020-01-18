package design;

public interface Employee1 {

    /*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
    //please read the following method and understand the business requirements of these following methods

    //and then implement these in a concrete class.

    // 1:           employeeId() will return employee id.
    public int employeeId();

    // 2:           employeeName() will return employee name
    public String employeeName();

    //3:           3: assignDepartment() will assign employee to departments
    public void assignDepartment(String dept);

    //4:            calculate employee salary
    public int calculateSalary();

    //5:            employee benefit
    public void benefitLayout();

    //..... Added extra methods .......//

    //6:            employeeBonus() will return employee bonus;
    public void bonus();

    //7:            employeeAge
    public int age(String dob);
}
