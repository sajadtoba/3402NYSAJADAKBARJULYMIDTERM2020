package math.problems;


import json.parser.JsonReaderUtil;
//import org.junit.Assert;
import org.junit.Test;
import org.testng.Assert;
import string.problems.Anagram;

public class  UnitTestingMath {


     public static void main(String[] args) {
         UnitTestingMath trytoRunalltests = new UnitTestingMath();
         trytoRunalltests.testWordsAreAnagram9();
        trytoRunalltests.testWordsAreAnagramPnt();
         //trytoRunalltests.testWordsAreNotAnagram();
         System.out.println("trying to run all together ");
     }
    //Apply Unit testing into each classes and methods in this package.

    //....................

    @Test
         public void testWordsAreAnagram9(){
        boolean expectedResult6 = true;
        boolean actualResult = Anagram.areAnagram("Sajjad","Sajjad");
        Assert.assertEquals(actualResult,expectedResult6,"not anagram");}

    @Test
    public void testWordsAreAnagramPnt(){
        boolean expectedResult = true;
        boolean actualResult = Anagram.areAnagram("REHMAN","REHMAN");
        Assert.assertEquals(actualResult,expectedResult,"hello");
    }

   @Test
    public void testWordsAreNotAnagram() {
        boolean expectedResult = true;
        boolean actualResult = Anagram.areAnagram("PNT", "pnt");
        Assert.assertEquals(actualResult,expectedResult,"not go");
    }

}
