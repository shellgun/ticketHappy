package com.example.myapplication;

public class Algorithm {

    public Algorithm() {

    }
    public static boolean isHappyTicket(String input) {
        int inputInt = Integer.parseInt (input);
        int s1 = 0, s2 = 0;
        for (int i = 0; i < 3; i++) ;
        s1 = s1 + inputInt % 10;
        inputInt = inputInt / 10;

        for (int i = 1; i < 3; i++) ;
        s2 = s2 + inputInt % 10;
        inputInt = inputInt / 10;
        return s1 == s2;


    }

    public int nextHappyInt(String input) {
        int inputInt = Integer.parseInt (input);
        if (!(inputInt > 99_999 && inputInt < 999_999)) {
            return -1;
        }


        while (inputInt <= 999_999) {
            if (isHappyTicket (String.valueOf (inputInt)) == true) {
                return inputInt;
            } else {
                inputInt++;

            }
        }
        return  -1;
    }
}