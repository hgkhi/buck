/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buck;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author khoi.a.hoang
 */
public class CurrencyTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of toString method, of class Currency.
     *
     * @throws buck.CurrencyException
     */
    @Test
    public void testValidConstruction() throws CurrencyException {
        Currency jpn = new Currency("JPN");
        Assert.assertNotNull(jpn);
    }

    @Test(expected = CurrencyException.class)
    public void testInvalidConstructionLongLength() throws CurrencyException {
        Currency jpn = new Currency("PPPP");
    }

    @Test(expected = CurrencyException.class)
    public void testInvalidConstructionShortLength() throws CurrencyException {
        Currency jpn = new Currency("PP");
    }
    
    @Test(expected = CurrencyException.class)
    public void testInvalidConstructionInvalidChar() throws CurrencyException {
        Currency jpn = new Currency("PnP");
    }

    /**
     * Test of toString method, of class Currency.
     * @throws buck.CurrencyException
     */
    @Test
    public void testToString() throws CurrencyException {
        Currency instance = new Currency("JPN");
        String expResult = "JPN";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
