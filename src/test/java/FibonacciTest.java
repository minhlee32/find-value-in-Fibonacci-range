import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void findValue() {
        int expected = 1;

        int actual = Fibonacci.findValue(1);
        assertEquals(expected, actual);
    }

    @Test
    void findValue1() {
        int expected = 1;

        int actual = Fibonacci.findValue(2);
        assertEquals(expected, actual);
    }

    @Test
    void findValue2() {
        int expected = 2;

        int actual = Fibonacci.findValue(3);
        assertEquals(expected, actual);
    }

    @Test
    void findValue3() {
        int expected = 3;

        int actual = Fibonacci.findValue(4);
        assertEquals(expected, actual);
    }

    @Test
    void findValue4() {
        int expected = 89;

        int actual = Fibonacci.findValue(11);
        assertEquals(expected, actual);
    }

    @Test
    void findValue5() {
        int expected = 8;

        int actual = Fibonacci.findValue(6);
        assertEquals(expected, actual);
    }


}