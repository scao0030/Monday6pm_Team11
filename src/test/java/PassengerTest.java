

import org.example.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    private Passenger passenger;

    @BeforeEach
    public void setUp() {
        passenger = new Passenger();
    }

    @Test
    @DisplayName("Set and Get Email")
    public void testEmail() {
        passenger.setEmail("test@example.com");
        assertEquals("test@example.com", passenger.getEmail());
    }

    @Test
    @DisplayName("Set and Get First Name")
    public void testFirstName() {
        passenger.setFirstName("John");
        assertEquals("John", passenger.getFirstName());
    }

    @Test
    @DisplayName("Set and Get Second Name")
    public void testSecondName() {
        passenger.setSecondName("Doe");
        assertEquals("Doe", passenger.getSecondName());
    }

    @Test
    @DisplayName("Set and Get Phone Number")
    public void testPhoneNumber() {
        passenger.setPhoneNumber("+123456789");
        assertEquals("+123456789", passenger.getPhoneNumber());
    }

    @Test
    @DisplayName("Set and Get Card Number")
    public void testCardNumber() {
        passenger.setCardNumber("1234-5678-9012-3456");
        assertEquals("1234-5678-9012-3456", passenger.getCardNumber());
    }

    @Test
    @DisplayName("Set and Get Security Code")
    public void testSecurityCode() {
        passenger.setSecurityCode(123);
        assertEquals(123, passenger.getSecurityCode());
    }

    @Test
    @DisplayName("Set and Get Passport")
    public void testPassport() {
        passenger.setPassport("AB1234567");
        assertEquals("AB1234567", passenger.getPassport());
    }

    @Test
    @DisplayName("Set and Get Gender")
    public void testGender() {
        passenger.setGender("Male");
        assertEquals("Male", passenger.getGender());
    }

    @Test
    @DisplayName("Set and Get Age")
    public void testAge() {
        passenger.setAge(25);
        assertEquals(25, passenger.getAge());
    }

    @Test
    @DisplayName("toString contains important info")
    public void testToString() {
        passenger.setFirstName("Alice");
        passenger.setSecondName("Smith");
        passenger.setEmail("alice@example.com");
        passenger.setPhoneNumber("123456789");
        passenger.setPassport("XY123456");

        String result = passenger.toString();
        assertTrue(result.contains("Alice"));
        assertTrue(result.contains("Smith"));
        assertTrue(result.contains("alice@example.com"));
        assertTrue(result.contains("123456789"));
        assertTrue(result.contains("XY123456"));
    }
}
