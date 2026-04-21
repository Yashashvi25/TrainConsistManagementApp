import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] bogies = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        TrainConsistManagementApp.sortBogieNames(bogies);

        assertArrayEquals(
                new String[]{
                        "AC Chair",
                        "First Class",
                        "General",
                        "Luxury",
                        "Sleeper"
                },
                bogies
        );
    }

    @Test
    void testSort_UnsortedInput() {
        String[] bogies = {
                "Luxury",
                "General",
                "Sleeper",
                "AC Chair"
        };

        TrainConsistManagementApp.sortBogieNames(bogies);

        assertArrayEquals(
                new String[]{
                        "AC Chair",
                        "General",
                        "Luxury",
                        "Sleeper"
                },
                bogies
        );
    }

    @Test
    void testSort_AlreadySortedArray() {
        String[] bogies = {
                "AC Chair",
                "First Class",
                "General"
        };

        String[] original = bogies.clone();

        TrainConsistManagementApp.sortBogieNames(bogies);

        assertArrayEquals(original, bogies);
    }

    @Test
    void testSort_DuplicateBogieNames() {
        String[] bogies = {
                "Sleeper",
                "AC Chair",
                "Sleeper",
                "General"
        };

        TrainConsistManagementApp.sortBogieNames(bogies);

        assertArrayEquals(
                new String[]{
                        "AC Chair",
                        "General",
                        "Sleeper",
                        "Sleeper"
                },
                bogies
        );
    }

    @Test
    void testSort_SingleElementArray() {
        String[] bogies = {"Sleeper"};

        TrainConsistManagementApp.sortBogieNames(bogies);

        assertArrayEquals(
                new String[]{"Sleeper"},
                bogies
        );
    }
}