package ru.netology.javaqa.javaqamvn.services;

public class SQRService {
    public int calcSQR(int lowerLimit, int upperLimit) {
        int result = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i < upperLimit & i * i > lowerLimit) {
                result++;
            }
        }
        return result;
    }
}
