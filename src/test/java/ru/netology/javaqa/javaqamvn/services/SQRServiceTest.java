package ru.netology.javaqa.javaqamvn.services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void calculateSqrService(int lowerLimit,int upperLimit,int expected) {
        SQRService service = new SQRService();

        int actual = service.calcSQR(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }

}
