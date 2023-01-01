import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {
    @Test
    void normalTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        // Set the System.out PrintStream to use the ByteArrayOutputStream
        System.setOut(new PrintStream(outContent));

        String input = "20";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        main.main(null);

        assertEquals("Enter the score = The grade of 20 is F", outContent.toString());
    }

    @Test
    void abnormalTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String input = "QQ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        main.main(null);

        assertEquals("Enter the score = Not an integer!", outContent.toString());
    }

    @Test
    void testShouldThrowIOException() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException();
            }
        };
        System.setIn(inputStream);
        main.main(null);
        assertEquals("Enter the score = ", outContent.toString());
    }
}