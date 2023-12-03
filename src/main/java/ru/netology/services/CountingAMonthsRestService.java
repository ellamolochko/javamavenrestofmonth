package ru.netology.services;

public class CountingAMonthsRestService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int counter = 0;
        for (int i = 1; i <= 12; i++) {
            if (count >= threshold) {
                count = (count - expenses) / 3;
                counter++;
            } else {
                count = count + income - expenses;
            }
        }

        return counter;
    }

}
