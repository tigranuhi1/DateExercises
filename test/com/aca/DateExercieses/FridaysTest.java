package com.aca.DateExercieses;

import java.time.LocalDate;

public class FridaysTest {
    public static void main(String[] args) {
        prevFridaysTest(LocalDate.of(2019, 5, 8), LocalDate.of(2019, 5, 3));
        nextFridaysTest(LocalDate.of(2019, 5, 8), LocalDate.of(2019, 5, 10));

        prevFridaysTest(LocalDate.of(2019, 1, 1), LocalDate.of(2018, 12, 28));
        nextFridaysTest(LocalDate.of(2019, 1, 1), LocalDate.of(2019, 1, 4));

        prevFridaysTest(LocalDate.of(2019, 12, 31), LocalDate.of(2019, 12, 27));
        nextFridaysTest(LocalDate.of(2019, 12, 31), LocalDate.of(2020, 1, 3));
    }

    private static void nextFridaysTest(LocalDate forDate, LocalDate expectedResult) {
        assert FriDays.getNextFridayDate(forDate).equals(expectedResult);
    }

    private static void prevFridaysTest(LocalDate forDate, LocalDate expectedResult) {
        assert FriDays.getPreviousFridayDate(forDate).equals(expectedResult);
    }

}
