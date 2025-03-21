import org.example.TicketSystem;
import org.junit.jupiter.api.Test;

public class TicketSystemTest
{

    @Test
    public void testBuyTicket_Single_Success() throws Exception {
        TicketSystem system = new TicketSystem();
        system.buyTicket(101);  // 假设 101 是有效的 ticket_id
        system.showTicket();    // 应该能看到票的信息
    }

    @Test
    public void testBuyTicket_InvalidTicketId() throws Exception {
        TicketSystem system = new TicketSystem();
        system.buyTicket(-1);
        // -1 是无效的票 ID
        // 应该输出：“This ticket does not exist.”
    }


    @Test
    public void testBuyTicket_Transfer_Success() throws Exception {
        TicketSystem system = new TicketSystem();
        system.buyTicket(201, 202); // 假设两个 ticket_id 分别属于两段转机
        system.showTicket();
    }


    @Test
    public void testChooseTicket_DirectFlight() throws Exception {
        TicketSystem system = new TicketSystem();
        system.chooseTicket("Beijing", "Shanghai"); // 假设有直飞
    }


    @Test
    public void testChooseTicket_NoRouteAvailable() throws Exception {
        TicketSystem system = new TicketSystem();
        system.chooseTicket("Mars", "Moon"); // 假设这两个城市没有航班
        // 应输出：“There is no possible variants.”
    }

}
