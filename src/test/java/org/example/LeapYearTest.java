package org.example;

import org.example.LeapYear;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @ParameterizedTest
    @ValueSource(ints = {2004, 2008, 2012})
    public void testYearsDivisibleByFourButNotOneHundredAreLeapYears(int year) {
        assertTrue(LeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 2400})
    public void testYearsDivisibleByFourHundredAreLeapYears(int year) {
        assertTrue(LeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2005, 2010, 2022})
    public void testYearsNotDivisibleByFourAreNotLeapYears(int year) {
        assertFalse(LeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2100})
    public void testYearsDivisibleByOneHundredAndNotByFourHundredAreNotLeapYears(int year) {
        assertFalse(LeapYear.isLeapYear(year));
    }
}
