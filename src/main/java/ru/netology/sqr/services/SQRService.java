package ru.netology.sqr.services;

public class SQRService {

    public int occurrenceOfСount(int a, int b) {
        int numberOccurence = 0;
        for (int i = a; i <= b; i++) {
            if (10 <= i * i && i * i <= 99) {
                System.out.print("Квадратный корень " + i * i + " равен " + i + "\n");
                numberOccurence++;
            }
        }
        return numberOccurence;
    }

}
