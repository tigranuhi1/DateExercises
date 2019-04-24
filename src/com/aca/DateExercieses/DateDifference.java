package com.aca.DateExercieses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class DateDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date format.");
        DateTimeFormatter formatter = getValidDateFormatter(sc.nextLine());
        System.out.println("Enter a date in that format.");
        LocalDate date = getValidDate(sc.nextLine(), formatter);

        System.out.println(String.format("The difference between %s and now is %s days.", date, getDateDifference(LocalDate.now(), date)));
    }

    static long getDateDifference(LocalDate date1, LocalDate date2) {
        if (!date1.isEqual(date2)) {
            if (date1.isBefore(date2)) {
                return DAYS.between(date1, date2);// date1.until(date2).getDays();
            } else {
                return DAYS.between(date1, date2);// date2.until(date1).getDays();
            }
        }
        return 0;
    }

    private static DateTimeFormatter getValidDateFormatter(String format) {
        while (true) {
            try {
                return DateTimeFormatter.ofPattern(format);
            } catch (IllegalArgumentException ex) {
                System.out.println("Incorrect format. Try again.");
            }
        }
    }

    private static LocalDate getValidDate(String date, DateTimeFormatter formatter) {
        while (true) {
            try {
                return LocalDate.parse(date, formatter);
            } catch (DateTimeParseException ex) {
                System.out.println("Incorrect date. Try again.");
            }
        }
    }

//    static void printDateDifference(LocalDate date) {
//        int difference = 0;
//        LocalDate nowDate = LocalDate.now();
//        if (!nowDate.isEqual(date)) {
//            if (nowDate.isBefore(date)) {
//                difference = nowDate.until(date).getDays();
//            } else {
//                difference = date.until(nowDate).getDays();
//            }
//        }
//
//        System.out.println(String.format("The difference between %s and now is %s days.", date, difference));
//    }
}
