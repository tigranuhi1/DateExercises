package com.aca.DateExercieses;

import java.time.LocalDate;

public class DateDifferenceTest {
    public static void main(String[] args) {
        dateDifferenceTest(LocalDate.of(2019,04,10), LocalDate.of(2019,04,15), 5);
        dateDifferenceTest(LocalDate.of(2019,04,10), LocalDate.of(2020,04,10), 366);
        dateDifferenceTest(LocalDate.of(2019,01,01), LocalDate.of(2019,03,01), 59);

    }

    private static void dateDifferenceTest(LocalDate date1, LocalDate date2, long expected){
        assert DateDifference.getDateDifference(date1, date2) == expected;
    }
}
