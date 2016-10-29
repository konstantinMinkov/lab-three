package ua.kpi.third;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by Vladyslav on 29.10.2016.
 */

public class MockGeronsTest {
    private static GeronsFormula geronsFormula;

    @BeforeClass
    public static void mockMathService() {
        MathService mathService = mock(MathService.class);
        when(mathService.isPositive(3)).thenReturn(true);
        when(mathService.isPositive(4)).thenReturn(true);
        when(mathService.isPositive(5)).thenReturn(true);
        when(mathService.isPositive(-5)).thenReturn(false);
        when(mathService.squareRoot(36)).thenReturn(6.0);
        geronsFormula = new GeronsFormula(mathService);
    }

    @Test
    public void testPositiveSide() {
        assertThat(geronsFormula.getTriangleArea(3, 4, 5), is(6.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSide() {
        geronsFormula.getTriangleArea(3, 4, -5);
    }

    @Test
    public void testSquareRoot() {
        assertThat(geronsFormula.getTriangleArea(3, 4, 5), is(6.0));
    }

}
