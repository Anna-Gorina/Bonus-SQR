package ru.netology.sqr;

public class SQRService {
    public int calculateSQR (int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++){
            int result = i * i;
            if (result <= max && result >= min) {
                count++;
               }
        }
        return count;
    }
}
