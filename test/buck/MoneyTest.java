/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buck;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author khoi.a.hoang
 */
public class MoneyTest {
    
    private Currency jpy;
    private Money money;
    
    public MoneyTest() throws CurrencyException {
        jpy = new Currency("JPY");
    }
    
    @Before
    public void setUp() {
        money = new Money(1_200_000, jpy);
    }
    
    @After
    public void tearDown() {
        money = null;
    }

    /**
     * Test of toString method, of class Money.
     */
    @Test
    public void testToString() {
        String expResult = "JPY 1200000.00";
        String result = money.toString();
        assertEquals(expResult, result);
    }
    
}
