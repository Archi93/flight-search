public class Flight {

    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String flightInfo() {
        String info = "Flight from " + departure + " to " + arrival + ".";
        return info;
    }
}
