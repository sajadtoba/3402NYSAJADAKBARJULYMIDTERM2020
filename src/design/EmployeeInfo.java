package design;

import com.sun.deploy.security.SelectableSecurityManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EmployeeInfo extends AbstractEmployee implements Employee {

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
	private String name;
	private int employeeID;
	private String department;
	private int salary;
	private char gender;
	private String dob;  // year/month/day
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
	// 1st Constructor
	public EmployeeInfo(int employeeId) {
		this.employeeID = employeeId;
	}
	// 2nd Constructor

	public EmployeeInfo(String name, int employeeID) {
		this.name = name;
		this.employeeID = employeeID;
	}
	// 3rd Constructor

	public EmployeeInfo(String name, int employeeID, String department, int salary, char gender, String dob) {
		this.name = name;
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
		this.gender = gender;
		this.dob = dob;
	}


	//....................... Setter for all of the variables

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

	public static void setTotalNumOfEmployees(int totalNumOfEmployees) {
		EmployeeInfo.totalNumOfEmployees = totalNumOfEmployees;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	// ....................... Getter

	public String getName() {
		return name;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
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

	@Override
	public int employeeId() {
		return employeeID;
	}

	@Override
	public void assignDepartment(String dept) {
		department = dept;
	}

	@Override
	public int calculateSalary() {
		return salary;
	}

	@Override
	public void benefitLayout() {
		System.out.println("The benefit layout is "+ getSalary() + "of salaery"+ calculateEmployeePension()+"0f pension on top to that 50 stock option each year");

	}

	@Override
	public void bonus() {

	}
	@Override
	//Calculating the age this method return the age...................

public int age(String dob) {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
	Date d = null;
	try {
		d= sdf.parse(dob);
	}catch ( ParseException e) {
		e.printStackTrace();
	}
	Calendar c = Calendar.getInstance();
		c.setTime(d);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		LocalDate l1 = LocalDate.of(year,month,day);
		LocalDate now1 = LocalDate.now();
		Period diff1 = Period.between(l1,now1);
		return diff1.getYears();
}
    @Override
	public String employeeName(){
		return name;
	}




	// one new method
	public static void stockOptions(){
	Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of years the employee has been with the company");
		int years = sc.nextInt();
		int stockOpt = years *50;
		System.out.println("The employee has an option of "+ stockOpt+ "stocks");
		sc.close();

	}
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */







public static double calculateEmployeeBonus(int performance, double salary) {

		double totalBonus = 0.0;
		if (performance== 5){
			totalBonus = salary * 0.1;
		} else if (performance >= 4) {
			totalBonus = salary * .08;
		} else if (performance >= 3) {
			totalBonus = salary * .06;
		} else if (performance >= 2) {
			totalBonus = 0;
			System.out.println("poor performance, need to improve to get the bonus.");
		} else {
			totalBonus = 0;
			System.out.println("Work hard to get qualify next time, no bonus");
		}
		return totalBonus;
	}
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		int total=0;
		return total;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public int calculateEmployeePension() {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();

		String convertedJoiningDate = DateConversion.convertDate(joiningDate);



		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		//implement numbers of year from above two dates
		String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4, convertedJoiningDate.length());
		String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4, convertedTodaysDate.length());
		int start = Integer.parseInt(startYear);
		int current = Integer.parseInt(currentYear);


		//Calculate pension
		int numberOfYears = current - start;

		if (numberOfYears >= 5) {
			total = (int)(salary * .25);
			//total = (int) (salary* .25);
		} else if (numberOfYears == 4) {
			total = (int) (salary * .20);
		} else if (numberOfYears == 3) {
			total = (int) (salary * .15);
		} else if (numberOfYears == 2) {
			total = (int) (salary * .10);
		}else if (numberOfYears == 1) {
			total = (int) (salary * .05);
		} else if (numberOfYears == 0){
		total = 0;
}
	return total;

	}



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
}
