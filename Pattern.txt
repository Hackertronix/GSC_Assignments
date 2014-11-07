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
 *
 * The following pattern
 *    * * * * * * * *
 *      * * * * * *
 *       * * * * *
 *        * * * *
 *         * * *
 *          * *
 *           *
 *

 */
public class Pattern {
    public static void main(String args[]) {

        int counter1, counter2, space = 0;

        for (counter1 = 0; counter1 < 8; counter1++)  //loop for the main body of the pattern
        {
            for ( counter2 = 0; counter2 < space; counter2++)  //loop for printing the spaces
                System.out.print(" ");
            for (int asterisk = counter1; asterisk < 8; asterisk++)  //loop for printing the asterisk
                System.out.print("* ");
            space++;  //incrementation of the space variable
            System.out.println();  //moving the cursor to the next line

        }
    }
}
