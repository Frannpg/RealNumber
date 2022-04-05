/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realnumber;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author alumno
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {
    private final double value;
    private final double exp;

    public ParameterizedTest(double value, double exp) {
        this.value = value;
        this.exp = exp;
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
            {4,2},
            {1.5,1.224744},
            {0,0},
            {1000,31.622776},
//            {0.1,0.316225},
//            {0.5,0.707106}
        });
    }
    
    @Test
    public void testSquareRoot(){
        assertEquals(exp, new RealNumber(value).squareRoot(),0.001);
    }
}
    //ERRORS
    //Values with 0.* returns the same number of the value
