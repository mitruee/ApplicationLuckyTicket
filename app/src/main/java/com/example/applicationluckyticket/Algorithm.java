package com.example.applicationluckyticket;

import java.util.Arrays;

public class Algorithm {
    
    public Algorithm() {
    }

    public boolean isHappyTicket(String input) {
        int inputInt = Integer.parseInt(input);

        int s1 = 0, s2 = 0;


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

        if (s1 == s2) {
            return true;
        } else {
            return false;
        }
    }

    public int nextHappyTicket(String input) {
        int inputInt = Integer.parseInt(input);

        if (!isHappyTicket(Integer.toString(inputInt))) {
            while (!isHappyTicket(Integer.toString(inputInt))) {
                inputInt = inputInt + 1;
            }
            return inputInt;
        } else {
            return inputInt;
        }
    }
}


