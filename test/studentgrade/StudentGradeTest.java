package studentgrade;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/* JUnit 4 */
public class StudentGradeTest {

    // score 95 should return A
    @Test
    public void testGetGrade95() {
        assertEquals("A", StudentGrade.getGrade(95));
    }

    // score 90 boundary should return A
    @Test
    public void testGetGrade90() {
        assertEquals("A", StudentGrade.getGrade(90));
    }

    // score 100 boundary should return A
    @Test
    public void testGetGrade100() {
        assertEquals("A", StudentGrade.getGrade(100));
    }

    // score 85 should return B
    @Test
    public void testGetGrade85() {
        assertEquals("B", StudentGrade.getGrade(85));
    }

    // score 80 boundary should return B
    @Test
    public void testGetGrade80() {
        assertEquals("B", StudentGrade.getGrade(80));
    }

    // score 89 boundary should return B
    @Test
    public void testGetGrade89() {
        assertEquals("B", StudentGrade.getGrade(89));
    }

    // score 50 should return F
    @Test
    public void testGetGrade50() {
        assertEquals("F", StudentGrade.getGrade(50));
    }

    // score 79 boundary should return F
    @Test
    public void testGetGrade79() {
        assertEquals("F", StudentGrade.getGrade(79));
    }

    // score above 100 should return F
    @Test
    public void testGetGradeAbove100() {
        assertEquals("F", StudentGrade.getGrade(110));
    }

    // score 0 should return F
    @Test
    public void testGetGrade0() {
        assertEquals("F", StudentGrade.getGrade(0));
    }
}
