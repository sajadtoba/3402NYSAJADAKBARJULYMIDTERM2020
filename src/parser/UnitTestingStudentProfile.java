package parser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {


        //Apply Unit Test into all the methods in this package.
        try {
            Student student = new Student();
            student.firstName.toString();
            Assert.assertEquals("John", "Doe", "does not match");
        } catch (Exception e) {
            e.getMessage();
        }
    }


}