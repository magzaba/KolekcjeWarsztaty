import java.util.Collections;
import java.util.List;

/* TODO: zadanie 1
 zaimplementuj klasę Compartment używając wybranej kolekcji
 miejsca w przedziale ponumerowane są następująco:
      okno
  1           8
  2           7
  3           6
  4           5
      drzwi*/

class Compartment {


/* TODO: zadanie 2
    zaimplemetuj metodę bookSeat() uwzględniając trzy warianty:
    miejsce jest dostępne
    miejsce jest zajęte
    brak wolnych miejsc*/

    /**
     * Books a chosen seat and confirms reservation,  denies if not possible
     *
     * @param passenger
     * @param preferences
     * @return different messages depending on the seat availability
     * @see BookingMessage
     */
    String bookSeat(Passenger passenger, Preferences preferences) {

        return "";
    }


/* TODO: zadanie 3
    tworzenie raportów w formie listy Stringów - raporty mają wypisać:
      miejsca wolne
     miejsca zajęte
     lista pasażerów z miejscem przez nich zarezerwowanym
     listy powinny być posortowane w kolejności zgodnej z numeracją miejsc, tj. od miejsca 1 do 8*/

    /**
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
    SUCCESSFUL("Successfull booking"), UNAVAILABLE("Chosen seat unavailable"), OVERLOADED("No free seats in this compartment");
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
