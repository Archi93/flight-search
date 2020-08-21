public class TrainingExercises {



   public int quantityOfNumbersDividedBy3And5InRange(int rangeStart, int rangeEnd) {
        int result = 0;
        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result++;
            }
        }
        return result;
    }

    public int sumOfEvenNumberInRange(int rangeStart, int rangeEnd) {
        int result = 0;
        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }
}
