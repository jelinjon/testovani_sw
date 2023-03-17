package lab04;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleOutputTests {

    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    @BeforeEach
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    @AfterEach
    public void restoreStreams(){
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    @Test
    public void printOutput_stdOutRedirected_correctMessageCaptured(){
        String message = "hello";
        System.out.print(message);
        Assertions.assertEquals(message, outContent.toString());
    }
}
