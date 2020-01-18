package design; // Done................................................

import org.junit.Assert;
import org.junit.Test;
import string.problems.Anagram;

import javax.xml.namespace.QName;
import java.lang.reflect.AnnotatedArrayType;

public class UnitTestingEmployeeInfo {
    //public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

   // }
   public static void main(String[] args) {
       System.out.println("I have two test cases are passed and one is failed");
   }

   // i do not know if I can run all tests in one time. But I am allowed to run each test one by one.

    //..........................Outside the Main Method.........................................//

// This is failed Test......................................Test.......................Failed Test..................
   EmployeeInfo testobj = new EmployeeInfo("tester",9876,"Finance",120000,'M',"1990/07/30");

    @Test
    public void employeeIdTestPositive(){
       int exepectedResult = 1234;
       int actualResult = testobj.employeeId();
       Assert.assertEquals(1234,testobj.employeeId());

    }
    // This is Passed Test....................  //...................

    EmployeeInfo testobj2 = new EmployeeInfo("tester",1234,"Finance",120000,'M',"1990/07/30");

    @Test
    public void employeeIdTestPositive2(){
        int exepectedResult = 1234;
        int actualResult = testobj2.employeeId();
        Assert.assertEquals(1234,testobj2.employeeId());

    }

    // This is...............................

    EmployeeInfo testobj3 = new EmployeeInfo("tester",2345,"Finance",120000,'M',"1990/07/30");

    @Test
    public void employeeIdTestPositive3(){
        String exepectedResult = "Fince";
        String actualResult = testobj3.getDepartment();
        Assert.assertEquals("Finance",testobj3.getDepartment());

    }
//......................................................///.........................
EmployeeInfo testobj4 = new EmployeeInfo("tester",9876,"Finance",120000,'M',"1990/07/30");

    @Test
    public void employeeIdTestPositive4(){
        String expectedResult = "tester";
        String actualResult = testobj4.getName();
        //Assert.assertEquals(expected:"tester",testobj4.getName());
        Assert.assertEquals("tester12346",testobj4.getName());
    }
// This is failed test......................................///...............Failed Test..............








}




