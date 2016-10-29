package ua.kpi.third;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Vladyslav on 29.10.2016.
 */
public class SimpleGeronsTest {
    private static GeronsFormula geronsFormulaTest;

    @BeforeClass
    public static void initClass() {
        geronsFormulaTest = new GeronsFormula(new SimpleMathService());
    }

    @Test
    public void testArea() {
        assertThat(geronsFormulaTest.getTriangleArea(3, 4, 5), is(6.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSide() {
        geronsFormulaTest.getTriangleArea(3, 4, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAllNegativeSides() {
        geronsFormulaTest.getTriangleArea(-3, -4, -5);
    }
}
