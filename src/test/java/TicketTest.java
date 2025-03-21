import org.example.Passenger;
import org.example.Ticket;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TicketTest {

    private Ticket ticket;

    @BeforeEach
    public void setUp(){
        ticket = new Ticket();
        ticket.setPassenger(new Passenger());
    }

    @Test
    @DisplayName("validate ticket price when passenger is between 1 and 15")
    public void testPriceWhenPassengerIsBetween1And15(){
        ticket.getPassenger().setAge(14);
        ticket.setPrice(10);
        assertEquals(5,ticket.getPrice());
    }

    @Test
    @DisplayName("validate ticket price when passenger is over 60")
    public void testPriceWhenPassengerOver60(){
        ticket.getPassenger().setAge(60);
        ticket.setPrice(10);
        assertEquals(0,ticket.getPrice());
    }

    @Test
    @DisplayName("validate ticket price when passenger is between 15 and 60 ")
    public void testPriceWhenPassengerBetween15And60(){
        ticket.getPassenger().setAge(15);
        ticket.setPrice(10);
        assertEquals(11,ticket.getPrice());
    }



}
