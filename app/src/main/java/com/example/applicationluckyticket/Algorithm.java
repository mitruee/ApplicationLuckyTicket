package com.example.applicationluckyticket;

import java.util.Arrays;

public class Algorithm {

    // создание пустого конструктора
    public Algorithm() {
    }

    // метод определения счастливый билет или нет
    public boolean isHappyTicket(String input) {
        int inputInt = Integer.parseInt(input); // конвертирование данных из String в int

        int s1 = 0, s2 = 0; // создание буферных переменных


        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                s1 = s1 + inputInt % 10;
                inputInt = inputInt / 10;
            }
            if (i % 2 != 0) {
                s2 = s2 + inputInt % 10;
                inputInt = inputInt / 10;
            }
        }

        // проверка равенства
        if (s1 == s2) { // если суммы равны
            return true;   // то билет счастливый
        } else { // иначе
            return false; // билет не счастливый
        }
    }

    // метод определения следующего счастливого билета
    public int nextHappyTicket(String input) {
        int inputInt = Integer.parseInt(input); // конвертирование данных из String в int

        if (!isHappyTicket(Integer.toString(inputInt))) { // если билет не счастливый
            while (!isHappyTicket(Integer.toString(inputInt))) { // то выполняется цикл
                inputInt = inputInt + 1; // шаговой проверки следующих билетов до наступления счастливого билета
            }
            return inputInt; // возвращается найденный счастливый билет
        } else { // иначе (в случае изначально счастливого билета)
            return inputInt; // возвращается счастливый билет
        }
    }
}


