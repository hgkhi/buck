package buck;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author khoi.a.hoang
 */
public class RegularBucketTest {
    
    private RegularBucket bucket;
    private final Money money;
    private final Currency jpy;

    public RegularBucketTest() throws CurrencyException {
        jpy = new Currency("JPY");
        money = new Money(1_200_000, jpy);
    }
    
    @Before
    public void setUp() {
        bucket = new RegularBucket("unallocated", money);
    }
    
    @After
    public void tearDown() {
        bucket = null;
    }

    /**
     * Test of getMoney method, of class RegularBucket.
     */
    @Test
    public void testGetMoney() {
        assertEquals("unallocated" , bucket.getBucketId());
        assertEquals("JPY 1200000.00", bucket.getMoney().toString());
    }
    
}
