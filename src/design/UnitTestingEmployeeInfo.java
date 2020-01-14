package design;

import org.testng.Assert;
import org.testng.annotations.Test;
import string.problems.Anagram;

public class UnitTestingEmployeeInfo {
   // public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

    //}

    @Test
    public void testWordsAreAnagram(){
        boolean expectedResult = true;
        boolean actualResult = Anagram.areAnagram("CAT","CAT");
        Assert.assertEquals(expectedResult,actualResult);}

    @Test
    public void testWordsAreAnagramPnt(){
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


}
