package TestNG2;

import org.junit.Test;
import com.beust.jcommander.Parameters;

public class ParamTest {
    @Test
    @Parameters("myName")
    public void parameterTest(String myName) {
        System.out.println("Parameterized value is : " + myName);
    }
}

