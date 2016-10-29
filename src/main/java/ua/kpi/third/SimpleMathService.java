package ua.kpi.third;


public class SimpleMathService implements MathService {

    public int square(int of) {
        return of * of;
    }

    public double squareRoot(int of) {
        return squareRoot((float) of);
    }

    public double squareRoot(float of) {
        return Math.sqrt(of);
    }

    public boolean isPositive(int number) {
        return number > 0;
    }
}
