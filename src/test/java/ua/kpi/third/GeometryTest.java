package ua.kpi.third;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class GeometryTest {

    private static Geometry geometry;

    @BeforeClass
    public static void mockMathService() {
        MathService mathService = mock(MathService.class);
        when(mathService.isPositive(2)).thenReturn(true);
        when(mathService.isPositive(-2)).thenReturn(false);
        when(mathService.isPositive(0)).thenReturn(false);
        when(mathService.square(3)).thenReturn(9);
        when(mathService.square(4)).thenReturn(16);
        when(mathService.squareRoot(25)).thenReturn(5.0);
        geometry = new Geometry(mathService);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFirstCathetus() {
        geometry.hypotenuse(-2, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSecondCathetus() {
        geometry.hypotenuse(2, -2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeBothCathetuses() {
        geometry.hypotenuse(-2, -2);
    }

    public void testHypotenuse() {
        assertThat(geometry.hypotenuse(3, 4), is(5.0));
    }
}