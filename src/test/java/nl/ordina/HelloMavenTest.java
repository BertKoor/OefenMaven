package nl.ordina;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloMavenTest {

    @Test
    public void testGetNameNullArgs() {
        String[] args = null;
        genericTest(args, "Maven");
    }

    //@Test
    public void testGetNameNoArgs() {
        String[] args = {};
        genericTest(args, "Apache Maven");
    }

    @Test
    public void testGetNameOneArg() {
        String[] args = {"FooBar"};
        genericTest(args, "FooBar");
    }

//    @Test
//    public void testGetNameMoreArgs() {
//        String args = {"Foo", "Bar", "Code"};
//        genericTest(args, "Foo");
//    }
    
    private void genericTest(String[] args, String expected) {
        String result = HelloMaven.getName(args);
        assertEquals(result, expected);
    }
}
