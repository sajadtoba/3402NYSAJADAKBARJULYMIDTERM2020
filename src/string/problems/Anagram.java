package string.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        System.out.println(areAnagram("CAT", "ACT"));
        System.out.println(  areAnagram("MARY", "ARMY") );
        // After I run i got  true in my console.
        // Now I will demonstreate with the different one to see the compare if my code is correct
        System.out.println(areAnagram("Sajad","Sajjad"));
    }


        public static boolean areAnagram (String word1, String word2) {
            if (word1.length() != word2.length()) {
                return false;
        } char[] word1array = word1.toCharArray();
            char[] word2array = word2.toCharArray();
            Arrays.sort(word1array);
            Arrays.sort(word2array);

            for (int i =0 ; i < word1array.length; i++ ) {
                if(word1array[i] != word2array[i]) {
                    return false;
                }
            }
            return  true; }


            // Outside main method we can do the unit testing
    // we create the method

    @Test
    public void testWordsAreAnagram(){
        boolean expectedResult = true;
        boolean actualResult = Anagram.areAnagram("Act","CATtt");
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