package com.aca.DateExercises;

import java.time.LocalDate;

public class FriDays {
    public static void main(String[] args) {
        System.out.println(String.format("The next Friday date is %s", getNextFridayDate(LocalDate.now()).toString()));
        System.out.println(String.format("The previous Friday date was %s", getPreviousFridayDate(LocalDate.now()).toString()));
    }

    static LocalDate getNextFridayDate(LocalDate forDate) {
        return forDate.plusDays(5 - forDate.getDayOfWeek().getValue());
    }

    static LocalDate getPreviousFridayDate(LocalDate forDate){
        return getNextFridayDate(forDate.minusDays(7));
    }
}
