import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    private List<Bogie> getSampleBogies() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 24));
        return bogies;
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        int result = TrainConsistManagementApp.calculateTotalCapacity(getSampleBogies());
        assertEquals(146, result);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        int result = TrainConsistManagementApp.calculateTotalCapacity(getSampleBogies());
        assertEquals(146, result);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));

        int result = TrainConsistManagementApp.calculateTotalCapacity(list);
        assertEquals(72, result);
    }

    @Test
    void testReduce_EmptyBogieList() {
        int result = TrainConsistManagementApp.calculateTotalCapacity(new ArrayList<>());
        assertEquals(0, result);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        int result = TrainConsistManagementApp.calculateTotalCapacity(getSampleBogies());
        assertEquals(146, result);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();
        TrainConsistManagementApp.calculateTotalCapacity(original);

        assertEquals(3, original.size());
    }
}