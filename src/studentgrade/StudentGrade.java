package studentgrade;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the student mark:");
            System.out.println("Student grade is " +
                    getGrade(scan.nextInt()));

    } 
    
    /**
     * Calculates grade as follows:
     * A (90 - 100), B (80 - 89), F ( < 80 && > 100)
     * @param mark Student mark
     * @return The grade based on the mark entered by user
     */
    public static String getGrade(int mark) {
        if (mark >= 90 && mark <= 100)
            return "A";
        else if (mark >= 80 && mark < 90)
            return "B";
        else if (mark >= 70 && mark < 80)
            return "C";
        else if (mark >= 60 && mark < 70)
            return "D";
        else 
            return "F";
    }
}
