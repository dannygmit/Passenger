package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PassengerTest {
    Passenger passenger;

    @BeforeAll
    static void startingTests() {
        System.out.println("Starting tests");
    }

    @BeforeEach
    void printDisplayNames(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry(testInfo.getDisplayName());
    }

    @AfterAll
    static void testingComplete() {
        System.out.println("Testing Complete");
    }

    @DisplayName("Testing constructor initialisation success")
    @Test
    void testingConstructorSuccess() {
        passenger = new Passenger("Mr", "Ruairi Doherty", "12345678910", "09874474338", 23);
        assertEquals("Mr", passenger.getTitle());
        assertEquals("Ruairi Doherty", passenger.getName());
        assertEquals("12345678910", passenger.getID());
        assertEquals("09874474338", passenger.getPhone());
        assertEquals(23, passenger.getAge());
    }

    @DisplayName("Testing invalid title entry")
    @Test
    void testingInvalidTitle() {
        assertThrows(IllegalArgumentException.class, () -> {
            passenger = new Passenger("M", "Bobccccccc", "12345678910", "4565555555555", 19);
        });
    }

    @DisplayName("Testing invalid name entry")
    @Test
    void testingInvalidName() {
        assertThrows(IllegalArgumentException.class, () -> {
            passenger = new Passenger("Mr", "B", "12345678910", "4565555555555", 19);
        });
    }

    @DisplayName("Testing invalid ID entry")
    @Test
    void testingInvalidID() {
        assertThrows(IllegalArgumentException.class, () -> {
            passenger = new Passenger("Mr", "Bobccccccc", "1", "4565555555555", 19);
        });
    }

    @DisplayName("Testing invalid phone entry")
    @Test
    void testingInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> {
            passenger = new Passenger("Mrs", "Bobccccccc", "12345678910", "4", 19);
        });
    }

    @DisplayName("Testing invalid age entry")
    @Test
    void testingInvalidAge() {
        assertThrows(IllegalArgumentException.class, () -> {
            passenger = new Passenger("Ms", "Bobccccccc", "12345678910", "4565555555555", 15);
        });
    }
}
