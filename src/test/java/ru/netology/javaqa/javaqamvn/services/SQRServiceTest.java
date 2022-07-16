package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void calculateSqrService(int lowerLimit,int upperLimit,int expected) {
        SQRService service = new SQRService();

        int actual = service.calcSQR(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }

}
