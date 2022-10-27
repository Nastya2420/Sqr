package ru.netology.sqr.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test

    public void occurrenceOfСount() {
        SQRService service = new SQRService();
        int a = 1;
        int b = 10;

        int quantity = service.occurrenceOfСount(a, b);

        System.out.print("Количество квадратов " + quantity);


    }


}
