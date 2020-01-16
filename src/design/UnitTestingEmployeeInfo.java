package design;

//import org.testng.Assert;
//import org.testng.annotations.Test;
//import string.problems.Anagram;

import org.junit.Assert;
import org.junit.Test;
import string.problems.Anagram;

import java.lang.reflect.AnnotatedArrayType;

public class UnitTestingEmployeeInfo {
    //public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

   // }
   public static void main(String[] args) {
       System.out.println("I have two test cases are passed and one is failed");
   }

   // i do not know if I can run all tests in one time. But I am allowed to run each test one by one.

    @Test
    public void testWordsAreAnagram(){
        boolean expectedResult = true;
        boolean actuarresult= Anagram.areAnagram("CAT","CAT");
        Assert.assertEquals(expectedResult,actuarresult);
    }

    @Test
    public void testWordsAreAnagram2(){
        boolean expectedResult = true;
        boolean actualResult = Anagram.areAnagram("CATT","CAT");
        Assert.assertEquals(expectedResult,actualResult);}

    @Test
    public void testWordsAreAnagramPnt1(){
        boolean expectedResult = true;
        boolean actualResult = Anagram.areAnagram("Act","Cat");
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testWordsAreNotAnagram() {
        boolean expectedResult = true;
        boolean actualResult = Anagram.areAnagram("Bob", "joe");
        Assert.assertEquals(expectedResult, actualResult);

    }
//




}
