package Academy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 * 
 */
public class AppTest extends TestCase

    
{
    public int a,b;
    public AppTest( String testName )
    {
        super( testName );
        
        System.out.println(a);
        System.out.println(b);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
        
      
    }

    int c;
    public void testApp()
    
    {
    	
    	System.out.println(c);
        assertTrue( true );
    }
}
