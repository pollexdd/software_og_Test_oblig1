package org.example;

import org.junit.Test;

public class Tests {

    @Test
    public Boolean isLeapYear(int year){

    float test1 = year / 4;
    float test2 = year / 100;
    float test3 = year / 400;

    if(test1 % 1 == 0 && test3 % 1 == 0 && !(test2 % 1 == 0)) { return true;}

    else {return false;}

}
}
