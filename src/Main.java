public class Main {

    public static void main (String args[]) {
        Flight warsawToBerlinFlight = new Flight("Warsaw", "Berlin");

        String flightInfo = warsawToBerlinFlight.flightInfo();
        System.out.println(flightInfo);
    }
}
