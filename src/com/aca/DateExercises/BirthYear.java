package com.aca.DateExercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BirthYear {
    public static void main(String[] args) {
        System.out.println("Type your birth date (dd-MM-yyyy).");
        Scanner sc = new Scanner(System.in);
        String BirthDate = sc.nextLine();
        int birthYear = getBirthYear(BirthDate);
        if (birthYear != -1) {
            System.out.println(String.format("You was born in %s", birthYear));
        } else {
            System.out.println("Incorrect date format. Try again in dd-MM-yyyy format.");
        }
    }

    static int getBirthYear(String BirthDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate date = LocalDate.parse(BirthDate, formatter);
            return date.getYear();
        } catch (DateTimeParseException ex) {
            return -1;
        }
    }
}
