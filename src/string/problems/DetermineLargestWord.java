package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        wordNLength.forEach((k,v) -> System.out.println("Key =" +k+ ",Value="+v));

        int maxLength = 0;
        for (Integer length : wordNLength.keySet())
            if (length > maxLength)
                maxLength = length;
        System.out.println(maxLength+ ""+ wordNLength.get(maxLength));

    }

    public static Map<Integer, String> findTheLargestWord(String string){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        for (String word : string.split(""))
            map.put(word.length(),word);
        return map;
    }
}
