package qa.test.tests;
import java.util.Properties;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SmokeTest {

	@Test( groups = { "smoke" }, description = "Print system properties.", enabled = true )
	public void testDummy()
	{
        Properties props = System.getProperties();
		Reporter.log( "---------------------------" );
		for ( String key : props.stringPropertyNames() ) {
			  String value = props.getProperty( key );
			  Reporter.log( key + " => " + value, true );
		}
		Reporter.log( "---------------------------" );		
		Reporter.log( "" );
	}
	
	@Test( groups = { "smoke" }, description = "Print system properties.", enabled = true )
	public void testForTestNGtestenvVar()
	{
        Properties props = System.getProperties();
        boolean found = false;
		for ( String key : props.stringPropertyNames() ) {
			if ( key.equals( "testenv" ) ) found = true;
		}
        Assert.assertTrue( found, "The 'testenv' system variable was not found." );
	}	
	
	@Test( groups = { "smoke" }, description = "Print system properties.", enabled = true )
	public void testFortestngDOTtestenvVar()
	{
        Properties props = System.getProperties();
        boolean found = false;
		for ( String key : props.stringPropertyNames() ) {
			if ( key.equals( "testng.testenv" ) ) found = true;
		}
        Assert.assertTrue( found, "The 'testng.testenv' system variable was not found." );
	}

}