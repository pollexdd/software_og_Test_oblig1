package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @Test
    public void testYearsDivisibleByFourButNotOneHundredAreLeapYears() {
        int[] years = {2004, 2008, 2012};
        for (int year : years) {
            assertTrue(LeapYear.isLeapYear(year));
        }
    }

    @Test
    public void testYearsDivisibleByFourHundredAreLeapYears() {
        int[] years = {2000, 2400};
        for (int year : years) {
            assertTrue(LeapYear.isLeapYear(year));
        }
    }


    @Test
    public void testYearsNotDivisibleByFourAreNotLeapYears() {
        int[] years = {2005, 2010, 2022};
        for (int year : years) {
            assertFalse(LeapYear.isLeapYear(year));
        }
    }

    @Test
    public void testYearsDivisibleByOneHundredAndNotByFourHundredAreNotLeapYears() {
        int[] years = {1900, 2100};
        for (int year : years) {
            assertFalse(LeapYear.isLeapYear(year));
        }
    }
}

