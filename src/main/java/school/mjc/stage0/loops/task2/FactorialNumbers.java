package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int factorial = 0;
        while (counter <= printToInclusive) {
            factorial = counter * factorial;
            if (factorial == 0) {
                factorial = 1;
            }
            System.out.println(factorial);
            counter++;
        }
    }
}
