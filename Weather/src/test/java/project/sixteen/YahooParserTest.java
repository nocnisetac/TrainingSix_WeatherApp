package project.sixteen;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.InputStream;

import project.sixteen.Weather;
import project.sixteen.YahooParser;

public class YahooParserTest extends TestCase {
	public YahooParserTest(String name) {
		super(name);
	}

	public void testParser() throws Exception {
		InputStream nyData = getClass().getClassLoader().getResourceAsStream("ny-weather.xml");
		Weather weather = new YahooParser().parse(nyData);
		assertEquals("New York", weather.getCity());
		assertEquals("NY", weather.getRegion());
		assertEquals("US", weather.getCountry());
		//assertEquals("39", weather.getTemp());
		//assertEquals("Fair", weather.getCondition());
		//assertEquals("39", weather.getChill());
		//assertEquals("67", weather.getHumidity());
	}
}