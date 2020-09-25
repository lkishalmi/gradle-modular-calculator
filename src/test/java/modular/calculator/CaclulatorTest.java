/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lkishalmi
 */
public class CaclulatorTest {

    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 30;
        int b = 12;
        Caclulator instance = new Caclulator();
        int expResult = 42;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

}
