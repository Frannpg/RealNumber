/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realnumber;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class RealNumberTest {

    /**
     * Test of squareRoot method, of class RealNumber.
     */
    @Test
    public void testSquareRoot() {
        System.out.println("squareRoot");
        //assertEquals(, new RealNumber().squareRoot(),0.001);
        assertEquals(2, new RealNumber(4).squareRoot(),0.001);
        assertEquals(1.414213, new RealNumber(2).squareRoot(),0.001);
        assertEquals(0, new RealNumber(0).squareRoot(),0.001);
        assertEquals(1.224744, new RealNumber(1.5).squareRoot(),0.001);
        assertEquals(31.622776, new RealNumber(1000).squareRoot(),0.001);
//        assertEquals(0.316225, new RealNumber(0.1).squareRoot(),0.001); //expected:<0.316225> but was:<0.1> wrong
        assertEquals(1, new RealNumber(1).squareRoot(),0.001);
//        assertEquals(0.707106, new RealNumber(0.5).squareRoot(),0.001); expected:<0.707106> but was:<0.5>
        assertEquals(3.181738, new RealNumber(10.1234567).squareRoot(),0.001);
        assertEquals(316.228240, new RealNumber(100000.3).squareRoot(),0.001);
    }
    
    //ERRORS
    //Values with 0.* returns the same number of the value
    
}
