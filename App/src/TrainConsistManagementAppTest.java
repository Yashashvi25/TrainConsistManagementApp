import org.junit.Test;
import static org.junit.Assert.*;

public class TrainConsistManagementAppTest {

    @Test(expected = IllegalStateException.class)
    public void testSearch_ThrowsExceptionWhenEmpty() {
        String[] bogies = {};
        TrainConsistManagementApp.searchBogie(bogies, "BG101");
    }

    @Test
    public void testSearch_AllowsSearchWhenDataExists() {
        String[] bogies = {"BG101", "BG205"};
        boolean result = TrainConsistManagementApp.searchBogie(bogies, "BG101");
        assertTrue(result);
    }

    @Test
    public void testSearch_BogieFoundAfterValidation() {
        String[] bogies = {"BG101", "BG205", "BG309"};
        boolean result = TrainConsistManagementApp.searchBogie(bogies, "BG205");
        assertTrue(result);
    }

    @Test
    public void testSearch_BogieNotFoundAfterValidation() {
        String[] bogies = {"BG101", "BG205", "BG309"};
        boolean result = TrainConsistManagementApp.searchBogie(bogies, "BG999");
        assertFalse(result);
    }

    @Test
    public void testSearch_SingleElementValidCase() {
        String[] bogies = {"BG101"};
        boolean result = TrainConsistManagementApp.searchBogie(bogies, "BG101");
        assertTrue(result);
    }
}