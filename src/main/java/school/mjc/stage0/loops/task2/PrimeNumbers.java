package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2;
        int counter = 1;
        int sum = 0;
        while (number <= printToInclusive) {
            while (counter <= number) {
                if (number % counter == 0) {
                    sum++;
                    counter++;
                }
                else {
                    counter++;
                }
            }
            if (sum == 2) {
                System.out.println(number);
            }
            number++;
            sum = 0;
            counter=1;
        }
    }
}
