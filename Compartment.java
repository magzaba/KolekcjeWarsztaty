import java.util.Collections;
import java.util.List;

/**
 * TODO: all the tasks
 *
 * <h2>task 1 - implement Compartment class</h2>
 * Implement Compartment class using a chosen collection.
 * Compartment seats are numbered as illustrated below:
 * <pre>
      window
  1           8
  2           7
  3           6
  4           5
      door
</pre>
 * <br/>
 * <h2>task 2 - implement bookSeat() method</h2>
 * Implement Compartment#bookSeat() method considering 3 variants:
 * <li>place is taken</li>
 * <li>place is free</li>
 * <li>no available places</li>
 * 
 * <br/>
 * <h2>task 3 - reporting time!</h2>
 * Create reports as a list of strings. Reports are to contain:
 * <li>all free places</li>
 * <li>all taken places</li>
 * <li>list of passengers with places they've reserved</li>
 * All lists should be sorted ascendingly per seat numbers (1-8).
 *
*/
class Compartment {


    /**
     * Books a chosen seat and confirms reservation,  denies if not possible
     *
     * @param passenger
     * @param preferences
     * @return different messages depending on the seat availability
     * @see BookingMessage
     * @see Compartment - task 2 - not before
     */
    String bookSeat(Passenger passenger, Preferences preferences) {

        return "";
    }



    /**
     * @see Compartment - task 3 - not before
     * @return list of available seats in ascending seat number order
     */
    List<String> listAvailable() {
        return Collections.emptyList();
    }

    /**
     * @return list of reserved seats in ascending seat number order
     */
    List<String> listReserved() {
        return Collections.emptyList();
    }

    /**
     * @return list of passengers with booked seats in ascending order of seat numbers
     */
    List<String> listPassengers() {
        return Collections.emptyList();
    }
}

enum BookingMessage {
    SUCCESSFUL("Successful booking"), UNAVAILABLE("Chosen seat is unavailable"), OVERLOADED("No free seats in this compartment");
    private final String message;

    BookingMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}


enum Preferences {
    WINDOW, DOOR, UNSPECIFIED
}


class Seat implements Comparable<Seat> {

    private Preferences preferences;
    private int number;

    public Seat(int number, Preferences preferences) {
        this.number = number;
        this.preferences = preferences;

    }

    @Override
    public String toString() {
        return "seat number:" + number + ", " + preferences.toString();
    }

    public int compareTo(Seat seat) {
        return Integer.compare(number, seat.number);
    }

    public Preferences checkLocation() {
        return preferences;
    }
}


class Passenger {
    String name;

    public Passenger(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
