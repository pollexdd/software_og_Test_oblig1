package org.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {

    @ParameterizedTest
    @ValueSource(ints = {2004, 2008, 2012})
    public void testYearsDivisibleByFourButNotOneHundredAreLeapYears(int year) {
        assertTrue(LeapYear.isLeapYear(year));
    }
    // tests if the year is divisible by 4 but not by 100.

    @ParameterizedTest
    @ValueSource(ints = {2000, 2400})
    public void testYearsDivisibleByFourHundredAreLeapYears(int year) {
        assertTrue(LeapYear.isLeapYear(year));
    }
    // tests if the year is divisible by 400.

    @ParameterizedTest
    @ValueSource(ints = {2005, 2010, 2022})
    public void testYearsNotDivisibleByFourAreNotLeapYears(int year) {
        assertFalse(LeapYear.isLeapYear(year));
    }
    // tests if the year is not divisible by 4.

    @ParameterizedTest
    @ValueSource(ints = {1900, 2100})
    public void testYearsDivisibleByOnehundredAndNotByFourHundredAreNotLeapYears(int year) {
        assertFalse(LeapYear.isLeapYear(year));
    }
    // tests if the year is divisible by 100 but not by 400.22
}
