package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int result;
        int counter = 0;
        if (power < 0) {
            System.out.println("too much power");
        }
        while (counter <= power){
            result = (int)Math.pow(2, counter);
            System.out.println(result);
            counter++;
        }
    }
}
