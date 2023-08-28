package org.example;


public class LeapYear {

    public static boolean isLeapYear(int year) {

        boolean isLeapYear;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        return isLeapYear;
    }
}
