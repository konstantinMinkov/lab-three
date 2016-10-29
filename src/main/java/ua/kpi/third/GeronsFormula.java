package ua.kpi.third;

/**
 * Created by Vladyslav on 29.10.2016.
 */
public class GeronsFormula {

    private MathService mathService;

    public GeronsFormula(MathService mathService) {
        this.mathService = mathService;
    }

    public double getTriangleArea(int sideOne, int sideTwo, int sideThree) {
        if(!mathService.isPositive(sideOne))
            throw new IllegalArgumentException();
        if(!mathService.isPositive(sideTwo))
            throw new IllegalArgumentException();
        if(!mathService.isPositive(sideThree))
            throw new IllegalArgumentException();

        final int halfPerim = (sideOne + sideTwo + sideThree) / 2;
        final double area = mathService.squareRoot(halfPerim * (halfPerim - sideOne) *
                    (halfPerim - sideTwo) * (halfPerim - sideThree));
        System.out.println(halfPerim * (halfPerim - sideOne) *
                (halfPerim - sideTwo) * (halfPerim - sideThree));
        return area;
    }
}
/*
3+4+5
6*3*2*1
6*/
