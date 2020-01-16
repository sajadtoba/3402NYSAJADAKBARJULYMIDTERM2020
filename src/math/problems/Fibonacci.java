package math.problems;   // ..............................done

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */




             int a = 0;
             int b = 1;
             int c;

        System.out.print(a + " " + b);
             for (int i=3; i<=40;i++)
             {
                 c =a+b;
                 System.out.print((" " +c));
                 a=b;
                 b=c;
             }




    }
}




