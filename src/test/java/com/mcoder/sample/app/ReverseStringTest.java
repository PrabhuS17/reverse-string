package com.mcoder.sample.app;


import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */

public class ReverseStringTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ReverseStringTest( String testName )
    {
        super( testName );
    }

    @org.junit.Test
    public void testReverseString() {
    	String actual = ReverseString.reverseString("born2learn");
    	
    	assertEquals("nrael2nrob", actual);
    }
    
 
}
