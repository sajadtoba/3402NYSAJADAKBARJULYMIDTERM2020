package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String st = "CAT";
        String rst ="ACT";
        char[]a = st.toCharArray();
        char[]b = rst.toCharArray();
        System.out.println(a.equals(b));

    }
}
