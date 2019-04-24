package com.aca.DateExercieses;

public class BirthYearTests {
    public static void main(String[] args) {
        birthYearTest("aaa", -1);
        birthYearTest("11-10-1976", 1976);
        birthYearTest("2004-01-02", -1);
    }

    private static void birthYearTest(String birthDate, int expectedResult) {
        assert BirthYear.getBirthYear(birthDate) == expectedResult;
    }
}
