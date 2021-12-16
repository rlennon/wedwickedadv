package mvnSimpleProj;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
* @author Dominick Doherty
*
*/
public class HelloWorld_TestTest {
@Test
public void testMain() {
final ByteArrayOutputStream outContent = new
ByteArrayOutputStream();
System.setOut(new PrintStream(outContent)); //make the output go to a stream instead of
//the console

App.main(null); //call main in the App file
//check if the output is "Hello LYIT!" and a new line.
assertEquals("Hello LYIT!" + System.getProperty("line.separator"),outContent.toString());
}
}

