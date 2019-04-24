package com.aca.DateExercieses;

public class IsLeapYearTest {
    public static void main(String[] args) {
        isLeapYearTest(2000, true);
        isLeapYearTest(2001, false);
        isLeapYearTest(2004, true);
    }

    private static void isLeapYearTest(int year, boolean expectedResult) {
        assert IsLeapYear.isLeapYear(year) == expectedResult;
    }
}
