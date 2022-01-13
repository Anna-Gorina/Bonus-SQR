package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource (value = {"SQR in range, 150, 500, 10",
                         "SQR min range, 81, 100, 1",
                         "SQR max range, 9801, 10000, 1",
                         "SQR under range, 50, 60, 0",
                         "SQR over range, 9900, 10000, 0"})
    void shouldCalculateSQR (String testName, int min, int max, int expected){
        SQRService service = new SQRService();

        int actual = service.calculateSQR(min, max);
        assertEquals(expected, actual);
    }

}