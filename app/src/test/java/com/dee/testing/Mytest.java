package com.dee.testing;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Mytest {
    @Test
    public void checkTwoNo(){
        Arithmetic arithmetic = new Arithmetic();
        float expected = 9;
        float actual = arithmetic.add(4,5);
        assertEquals(expected,actual);
    }


}
