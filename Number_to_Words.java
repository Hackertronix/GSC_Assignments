import java.io.BufferedReader;
import java.io.*;

import java.io.InputStreamReader;

/**
 * Created by Prateek Prasad
 *
 *
 * CSE 1st SEM
 *
 *
 * Phone - 8553417378
 * Email - leavethemails@gmail.com
 *
 *
 * The following code accepts a 3-digit number and then prints the number in words
 */
public class Number_to_Words {

    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n, h, u, t, t1;//variables declared
        String a[] = new String[20];//array declared
        String b[] = new String[8];//array declared
        System.out.println("Enter a number less than 1000");//print
        n = Integer.parseInt(in.readLine());//accepts integer
        if (n >= 1000)

        {
            System.out.println("Not a 3 digit number :p");//prints message

        } else

        {
            a = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            b = new String[]{"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            u = n % 10;
            t = n % 100;
            t1 = (t - u) / 10;
            h = (n - t) / 100;
            if (n >= 0 && n <= 19)
                System.out.println(a[n]);//prints the number in words
            else if (n >= 20 && n <= 99) {
                if (u == 0)
                    System.out.println(b[t1 - 2]);//prints the number in words
                else System.out.println(b[t1 - 2] + " " + a[u]);//prints the number in words
            } else if (n >= 100 && n <= 999) {
                if (t == 0 && u == 0)
                    System.out.println(a[h] + " Hundred");//prints the number in words
                else if (u == 0 && t != 0)
                    System.out.println(a[h] + " Hundred " + b[t1 - 2]);//prints the number in words
                else
                    System.out.println(a[h] + " Hundred and " + b[t1 - 2] + " " + a[u]);//prints the number in words
            }
        }
    }
}
