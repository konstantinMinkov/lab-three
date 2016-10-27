package ua.kpi.third;


import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleTest {

    private static SimpleClassToTest classToTest;

    @BeforeClass
    public static void initClass() {
        classToTest = new SimpleClassToTest();
    }

    @Test
    public void testSquare() {
        assertThat(classToTest.square(2), is(4));
    }

    @Test
    public void testIsPositiveNegative() {
        assertThat(classToTest.isPositive(-1), is(false));
    }

    @Test
    public void testIsPositiveZero() {
        assertThat(classToTest.isPositive(0), is(false));
    }

    @Test
    public void testIsPositivePositive() {
        assertThat(classToTest.isPositive(1), is(true));
    }
}
