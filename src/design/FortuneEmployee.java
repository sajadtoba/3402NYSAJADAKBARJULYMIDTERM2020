package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo e1 = new EmployeeInfo("Sajad Akbar", 001, "QA", 85000, 'M', "1960/01/01");
		EmployeeInfo e2 = new EmployeeInfo("Fahim Khan", 002, "DEV", 95000, 'M', "1960/01/02");
		EmployeeInfo e3 = new EmployeeInfo("Sahra Ahmad", 003, "QA", 96000, 'M', "1960/01/03");
		EmployeeInfo e4 = new EmployeeInfo("Samina Sheikh", 004, "QA", 86000, 'F', "1970/01/01");
		EmployeeInfo e5 = new EmployeeInfo("John Smith", 005, "DEV", 98000, 'M', "1950/02/02");
//************************************  			e6     e6 e6

		EmployeeInfo e6 = new EmployeeInfo("Mr.Chen", 006);
		e6.setDepartment("Finance");
		e6.setDob("1978/02/03");
		e6.setGender('M');
		e6.setSalary(190000);
//..........................    e7 e7



		EmployeeInfo e7 = new EmployeeInfo(007);
		e7.setName("Spider Man");
		e7.setEmployeeID(200);
		e7.assignDepartment("Developer");
		e7.setSalary(960000);
		e7.benefitLayout();
//.......................................... e8 e8

		AbstractEmployee e8 = new EmployeeInfo(808);   // added aextra jan15

		System.out.print(e6.getName()); // I removed the print           good
		System.out.print(e6.getSalary()); // I removed the println to print
		System.out.print(e6.getGender());   // I removed the println    ln


		EmployeeInfo.setTotalNumOfEmployees(85);
		System.out.println(EmployeeInfo.getTotalNumOfEmployees());
//*********************  				************************************

		System.out.print(e7.employeeId());   // i removed println to ln
		System.out.print(e7.employeeName());
		System.out.print(e7.calculateSalary());

		//.............................//......................
// E1								e1

		System.out.print(e1.getEmployeeID()); // I removed all three println to ln
		System.out.print(e1.getDepartment());
		System.out.print(e1.getDob());
		System.out.print(e1.age("1980/06/20"));


	//	System.out.println("The employee would receive         " + e1.calculateEmployeePension() + "USD of pension.");

		//System.out.println("");
		EmployeeInfo.stockOptions();

		System.out.print("");             // i removed ln
		System.out.print(EmployeeInfo.calculateEmployeeBonus(4, 99000)); // I removed ln

		System.out.print("");
		e1.calculateEmployeePension();
		System.out.print("");
	}

}
// we need to enter May,2015     enter
//                  August,2017   enter


