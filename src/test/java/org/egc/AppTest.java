package org.egc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalDate;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testMultiplica()
    {
        assertTrue(App.multiplica(3,2) == 6);
    }
    
    public void testNegativoMultiplica()
    {
        assertTrue(App.multiplica(3,3) != 6);
    }
    
    public void testDate()
    {
        LocalDate startDate = new LocalDate(2016, 11, 2);
        LocalDateTime startDateTime = new LocalDateTime(2016, 11, 2, 14, 0);
        LocalDate forCompare = startDateTime.toLocalDate();
        assertTrue(forCompare.equals(startDate));
    }
    
    public void testNegativoDate()
    {
        LocalDate startDate = new LocalDate(2017, 11, 2);
        LocalDateTime startDateTime = new LocalDateTime(2016, 11, 2, 14, 0);
        LocalDate forCompare = startDateTime.toLocalDate();
        assertTrue(!forCompare.equals(startDate));
    }
}
