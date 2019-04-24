package com.aca.DateExercieses;

import java.time.LocalDate;
import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        System.out.println("Type a year.");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        Boolean isLeapYear = isLeapYear(year);
        System.out.println(String.format("The year %s %s a leap year.", year, isLeapYear ? "is" : "is not"));
    }

    static boolean isLeapYear(int year) {
        return LocalDate.of(year, 1, 1).isLeapYear();
    }
}
