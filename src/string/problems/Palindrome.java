package string.problems;  // Done .......................................

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        // I am explaining in the both ways


        String word1 = "MOM";
        String word2 = "DAD";
        String  word3= "MADAM";

//        String word4 = "abba";
//        isPalindrome(word1);
//        isPalindrome(word2);
//        isPalindrome(word3);
//        isPalindrome(word4);

//        System.out.println(isPalindrome(word1));
//        System.out.println(isPalindrome(word2));
//        System.out.println(isPalindrome(word3));
        // Now we are usnign the 2nd ..........Pointer

        System.out.println(isPalindromeWith2Pointers(word1));
        System.out.println(isPalindromeWith2Pointers(word2));
        System.out.println(isPalindromeWith2Pointers(word3));


        //System.out.println(isPalindrome(word4));
        // We can print out the above
    }
// .....................Outside the main method..................................//........

//    public static  boolean isPalindrome(String word) {
//        String actualWord = word.toLowerCase();
//        String reversedWord = "";
//        for (int i = actualWord.length() - 1; i >= 0; i--) {
//            reversedWord = reversedWord + actualWord.charAt(i);
//        }   // after the for loop what should we do
//        return actualWord.equals(reversedWord);
//    }
//        if(actualWord.equals(reversedWord)) {
//            return  true;
//        } else  {
//            return false;
//        }
    //...................Outside the main Method..............................//..........

    // We create another method

// When we use 2nd pointer we need to make changes into the loop

    public static boolean isPalindromeWith2Pointers(String word) {
        String actualWord = word.toLowerCase();
        int startingPointer = 0;
        int endingPointer = actualWord.length() - 1;
        while (startingPointer < endingPointer) {
            if (actualWord.charAt(startingPointer) != actualWord.charAt(endingPointer)){
                return false;
        }
        startingPointer++;
        endingPointer--;

    }
        return true;

    } }


























