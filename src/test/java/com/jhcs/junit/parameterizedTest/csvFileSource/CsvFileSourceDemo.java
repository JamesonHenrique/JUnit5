package com.jhcs.junit.parameterizedTest.csvFileSource;

import com.jhcs.junit.example.StringHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvFileSourceDemo {
    @ParameterizedTest
    @CsvFileSource(resources = "/reverse.csv")
    public void csvFileSourceDemoTest(String input, String expect) {
        StringHelper stringHelper = new StringHelper();
        assertEquals(expect, stringHelper.reverse(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/reverse.csv", numLinesToSkip = 1)
    public void csvFileSourceDemoWithNumberOfLinesToSkipTest(String input, String expect) {
        StringHelper stringHelper = new StringHelper();
        assertEquals(expect, stringHelper.reverse(input));
    }

}

