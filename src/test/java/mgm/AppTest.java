package mgm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import mytest.Test1;

public class AppTest {

    @Test
    public void testApp() {
    Test1 t=new Test1();
        String expected = "madam";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }
}