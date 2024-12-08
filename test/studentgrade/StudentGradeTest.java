package studentgrade;

import junit.framework.TestCase;

/* JUnit 3.8.1 */
public class StudentGradeTest extends TestCase {
    
    public StudentGradeTest(String testName) {
        super(testName);
    }

    public void testGetGrade95() {
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }

    public void testGetGrade85() {
        System.out.println("getGrade 85");
        int mark = 85;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
    
    public void testGetGrade75() {
        System.out.println("getGrade 75");
        int mark = 75;
        String expResult = "C";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
      public void testGetGrade65() {
        System.out.println("getGrade 65");
        int mark = 65;
        String expResult = "D";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
      public void testGetGrade55() {
        System.out.println("getGrade 55");
        int mark = 55;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
}
