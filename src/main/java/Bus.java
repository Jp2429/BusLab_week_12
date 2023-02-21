import java.util.ArrayList;

public class Bus {
    private String destination;
    private Integer capacity;
    private ArrayList<Person> passenger;

    public Bus(String destination,Integer capacity){
        this.destination=destination;
        this.capacity=capacity;
        this.passenger=new ArrayList<Person>();
    }

    public int getPassengerCount() {
        return this.passenger.size();
    }

    public void addPassenger(Person person) {
        if(this.passenger.size() < this.capacity){
            this.passenger.add(person);
        }
    }

    public void removePassenger() {
        this.passenger.remove(0);
    }

    public void pickUp(BusStop busStop) {
        Person person=busStop.removeFromQueue();
        this.passenger.add(person);
    }
}
