package patterns_Adapter;

public class Main {
    public static void main(String[] args) {

        Ints IntsCalc = new IntsCalculator();

        System.out.println("POW (5,15): " + IntsCalc.pow(5,15));
        System.out.println("SUM (5,15): " + IntsCalc.sum(5,15));
        System.out.println("MULT (5,15): " + IntsCalc.mult(5,15));

    }
}
