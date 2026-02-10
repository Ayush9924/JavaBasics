package com.lpu.questions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class leapYearChecker {

    public static void main(String[] args) {

        String input = takeInput();

        int year = extractYear(input);
        boolean manualResult = isLeapYearManual(year);
        boolean apiResult = isLeapYearUsingLocalDate(input);

        printResult(year, manualResult, apiResult);
    }

    // 1️⃣ Take input
    static String takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (dd-MM-yyyy): ");
        return scanner.nextLine();
    }

    // 2️⃣ Extract year from string
    static int extractYear(String input) {
        String[] parts = input.split("-");
        return Integer.parseInt(parts[2]);
    }

    // 3️⃣ Manual leap year logic
    static boolean isLeapYearManual(int year) {
        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }

    // 4️⃣ Leap year using LocalDate API
    static boolean isLeapYearUsingLocalDate(String input) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input, formatter);
        return date.isLeapYear();
    }

    // 5️⃣ Print output
    static void printResult(int year, boolean manual, boolean api) {
        System.out.println("Year: " + year);
        System.out.println("Leap Year (Manual): " + (manual ? "Yes ✅" : "No ❌"));
        System.out.println("Leap Year (LocalDate): " + (api ? "Yes ✅" : "No ❌"));
    }
}
