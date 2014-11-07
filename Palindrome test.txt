import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Prateek Prasad
 *
 *
 * CSE 1st SEM
 *
 *
 * Phone - 8553417378
 * Email - leavethemails@gmail.com.
 *
 *
 * The following program will check if a string is a Palindrome and stops accepting input if entered string is GSCrnsit
 *
 *
 */
public class Palindrome_Test {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1="",str="",revStr="";


           /* Loop to take contnuous input till value */
            while (str1.compareTo("GSCrnsit")!=0){
                int length=0,counter=0;
                str="";
                revStr="";
                str1="";
                System.out.println("Enter a String");
                str1=br.readLine();
                str=str1.trim();
                str=str.toLowerCase();
                length=str.length();
                    for(counter=length-1;counter>=0;counter--){


                                      revStr=revStr+str.charAt(counter);   // Loop for String Reversal
                                        }

                                    // Palindrome check begins
                                        if(revStr.equals(str)){
                                            System.out.println("Palindrome");
                                        }
                                        else{
                                            System.out.println("Not a Palindrome");
                                        }
                                    // Palindrome check ends
            }


    }
}

