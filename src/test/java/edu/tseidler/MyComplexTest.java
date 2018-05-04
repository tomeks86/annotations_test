package edu.tseidler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyComplexTest {
    private Complex myNumber;

    @Before
    public void setUp() {
        myNumber = new Complex(1, 0);
    }

    @Test
    public void shouldAddNumber() {
        myNumber = myNumber.add(new Complex(1, 1));

        Assert.assertTrue(myNumber.equals(new Complex(2, 1)));
    }

    @Test
    public void shouldShowToString() {
        String myNumberRepresentaiton = myNumber.toString();

        Assert.assertEquals(myNumberRepresentaiton, "Complex[1,0]");
    }
}
