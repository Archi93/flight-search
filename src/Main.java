public class Main {

    public static void main (String args[]) {
        Flight warsawToBerlinFlight = new Flight("Warsaw", "Berlin");
        Main app = new Main();

        String flightInfo = warsawToBerlinFlight.flightInfo();
        System.out.println(flightInfo);

        // System.out.println(app.quantityOfNumbersDividedBy3And5InRange(4, 18));

        // System.out.println(app.sumOfEvenNumberInRange(6,10));

    }


   /* Secondary Ex

   private int quantityOfNumbersDividedBy3And5InRange(int rangeStart, int rangeEnd) {
        int result = 0;
        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result++;
            }
        }
        return result;
    }

    private int sumOfEvenNumberInRange(int rangeStart, int rangeEnd) {
        int result = 0;
        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }*/




}
