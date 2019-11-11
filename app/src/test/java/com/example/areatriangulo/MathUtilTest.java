package com.example.areatriangulo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilTest {

    Calculo math;

    @Before
    public void setup(){
        math = new Calculo();
    }

    @Test
    public void BaseMaiorZero(){
        assertEquals(24, math.Area(8.0,6.0),0.1);
    }

    @Test
    public void AlturaMaiorZero(){
        assertEquals(84, math.Area(14.0,12.0),0.1);
    }

    @Test
    public void BaseZero(){
        assertEquals(0, math.Area(0.0,1.0),0.1);
    }

    @Test
    public void AlturaZero(){
        assertEquals(0, math.Area(2.0,0.0),0.1);
    }
}
