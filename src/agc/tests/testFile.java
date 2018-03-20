package agc.tests;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.*;

public class testFile {
	
    private BufferedReader in = null;

    @Before
    public void setup()
        throws IOException
    {
        in = new BufferedReader(
            new InputStreamReader(getClass().getResourceAsStream("entrada.jsonfdsa")));
    }

    @After
    public void teardown()
        throws IOException
    {
        if (in != null)
        {
            in.close();
        }

        in = null;
    }

    @Test
    public void testInputFile()
        throws IOException
    {
        String line = in.readLine();
        System.out.println("Hi");
        System.out.println(in.toString());

        assertEquals(line, null);
    }

  
}
