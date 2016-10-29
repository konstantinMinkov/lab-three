package ua.kpi.third;


public class Geometry {

    private MathService mathService;

    public Geometry(MathService mathService) {
        this.mathService = mathService;
    }

    public double hypotenuse(int firstCathetus, int secondCathetus) {
        if ( !mathService.isPositive(firstCathetus))
            throw new IllegalArgumentException();
        if ( !mathService.isPositive(secondCathetus))
            throw new IllegalArgumentException();
        final int sumOfSquares = mathService.square(firstCathetus) +
                mathService.square(secondCathetus);
        return mathService.squareRoot(sumOfSquares);
    }
}
