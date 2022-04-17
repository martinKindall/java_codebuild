package com.myapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicTest {

    @Test
    public void testStringsAreEqual() {
        var anString = "Walrus Code";

        Assertions.assertEquals(anString, "Walrus Code");
    }

    @Test
    public void testNumbersAreEqual() {
        int superNumber = 2;

        Assertions.assertEquals(superNumber, 2);
    }
}
