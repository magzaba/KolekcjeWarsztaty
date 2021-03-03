package magzaba.com.github;


//zadanie 1
// zaimplementuj klasę Compartment używając wybranej kolekcji
// miejsca w przedziale ponumerowane są następująco:
//      okno
//  1           8
//  2           7
//  3           6
//  4           5
//      drzwi


//zadanie 2
// zarezerwuj miejsca dla następujących osób zgodnie z ich preferencjami:
// Anna Walczak - przy oknie
// Robert Walczak - naprzeciwko żony
// Adam Walczak - obok mamy
// Krzysztof Wilczek - przy drzwiach
// Każda rezerwacja potwierdzona informacją: "Zarezerwowano miejsce <nr> dla <pasażer>"
// Na koniec zrób podsumowanie - podaj listę pasażerów wraz miejscem, które zajmują


//zadanie 3
// spróbuj dokonać kolejnych rezerwacji:
// Piotr Kos - przy oknie
// Anna Duka - przy drzwiach
// Jan Duka - przy drzwiach
// Olaf Stano - bez preferencji
// Kinga Stano - bez preferencji
// Bartosz Kita - bez preferencji
// Stefan Chudy - bez preferencji
// Karol Młot - bez preferencji
// Odmów klientowi rezerwacji miejsca niedostępnego - wyświetl mu listę miejsc dostępnych
// Po przekroczeniu limitu miejsc w przedziale wyświetl informację "Przykro nam, brak miejsc w przedziale"


class SeatReservation {

}


class Seat {

    enum Position {
        WINDOW, DOOR, UNSPECIFIED
    }

    private Position position;
    private int number;

    public Seat(Position position, int number) {
        this.position = position;
        this.number = number;
    }
}

class Compartment {

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
