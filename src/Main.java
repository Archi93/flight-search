public class Main {

    public static void main (String args[]) {
        Flight warsawToBerlinFlight = new Flight("Warsaw", "Berlin");
        TrainingExercises trainingExercises = new TrainingExercises();

        String flightInfo = warsawToBerlinFlight.flightInfo();
        System.out.println(flightInfo);

        System.out.println(trainingExercises.quantityOfNumbersDividedBy3And5InRange(4, 18));

        System.out.println(trainingExercises.sumOfEvenNumberInRange(6,10));

    }







}
