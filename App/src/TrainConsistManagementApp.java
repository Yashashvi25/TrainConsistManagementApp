import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistManagementApp {

    // UC10 Method: Calculate total capacity using reduce
    public static int calculateTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 24));

        int total = calculateTotalCapacity(bogies);

        System.out.println("\nTotal Seating Capacity: " + total);
    }
}