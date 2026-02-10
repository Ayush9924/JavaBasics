package com.lpu.questions;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Date_formater {
    public static String findDay(int month, int day, int year) {

        try {
            SimpleDateFormat D = new SimpleDateFormat("dd-MM-yyyy");
            Date date = D.parse(day + "-" + month + "-" + year);

            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
            return dayFormat.format(date).toUpperCase();

        } catch (Exception e) {
            return "";
        }
    }
}
//import java.time.LocalDate;
//
//public class Date_formater {
//
//    public static String findDay(int month, int day, int year) {
//
//        LocalDate date = LocalDate.of(year, month, day);
//        return date.getDayOfWeek().toString();
//    }
//}
//import java.io.*;
//        import java.math.*;
//        import java.security.*;
//        import java.text.*;
//        import java.util.*;
//        import java.util.concurrent.*;
//        import java.util.function.*;
//        import java.util.regex.*;
//        import java.util.stream.*;
//        import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//import java.time.LocalDate;
//class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
//
//    public static String findDay(int month, int day, int year) {
//
//        LocalDate date = LocalDate.of(year, month, day);
//        return date.getDayOfWeek().toString();
//    }
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = Result.findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
