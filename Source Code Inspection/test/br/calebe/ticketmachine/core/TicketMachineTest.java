package br.calebe.ticketmachine.core;



import br.calebe.ticketmachine.core.TicketMachine;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31320600
 */
public class TicketMachineTest {
    
    @Test
    public void PrecoBilheteInicialTest() {
    TicketMachine tm = new TicketMachine(3);
    
    assertEquals(3, tm.getPrecoDoBilhete());    
    }
    
}
