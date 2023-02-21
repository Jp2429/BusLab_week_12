import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus=new Bus("London",30);
        busStop=new BusStop("York Place");
        person=new Person();
    }
    @Test
    public void canReturnPassengerCount(){
        assertEquals(0,bus.getPassengerCount());
    }
    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1,bus.getPassengerCount());
    }
    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.getPassengerCount());

    }
    @Test
    public void canPickUp(){
        busStop.addToQueue(person);
        bus.pickUp(busStop);
        assertEquals(1,bus.getPassengerCount());
    }

}
