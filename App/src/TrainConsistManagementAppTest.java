import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    private List<Bogie> getSampleBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 50));
        list.add(new Bogie("First Class", 24));
        return list;
    }

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> result = TrainConsistManagementApp.filterWithLoop(getSampleBogies());
        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> result = TrainConsistManagementApp.filterWithStream(getSampleBogies());
        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> loopResult = TrainConsistManagementApp.filterWithLoop(getSampleBogies());
        List<Bogie> streamResult = TrainConsistManagementApp.filterWithStream(getSampleBogies());

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<Bogie> bogies = getSampleBogies();

        long start = System.nanoTime();
        TrainConsistManagementApp.filterWithLoop(bogies);
        long end = System.nanoTime();

        assertTrue((end - start) > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Bogie" + i, i % 100));
        }

        List<Bogie> result = TrainConsistManagementApp.filterWithStream(bogies);
        assertNotNull(result);
    }
}