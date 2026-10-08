package org.iesteis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void shouldCalculateTheDriverSalaryForEachCase() {
        assertEquals(500, new SalarioMaquinista(10, 10, 5, 0, 0, 0).salarioTotal());
        assertEquals(350, new SalarioMaquinista(10, 10, 5, 0, 70, 80).salarioTotal());
        assertEquals(250, new SalarioMaquinista(10, 10, 5, 5, 70, 80).salarioTotal());
        assertEquals(-50, new SalarioMaquinista(10, 10, 2, 5, 70, 80).salarioTotal());
        assertEquals(0, new SalarioMaquinista(0, 100, 10, 0, 0, 0).salarioTotal());
        assertEquals(1114, new SalarioMaquinista(20, 4, 15, 2, 30, 40).salarioTotal());
    }

    @Test
    public void shouldProcessTheInputThroughApp() {
        String input = """
                2
                0 100 10 0 0 0
                20 4 15 2 30 40
                """;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;
        java.io.InputStream originalInput = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
        System.setOut(new PrintStream(output));

        try {
            App.main(new String[0]);
        } finally {
            System.setIn(originalInput);
            System.setOut(originalOutput);
        }

        assertEquals("0" + System.lineSeparator() + "1114" + System.lineSeparator(), output.toString());
    }
}
