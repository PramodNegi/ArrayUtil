package com.personal.assess;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ArrayUtilsTest {

    private Integer[] mainArray = new Integer[]{12, 65, 75, 90, 100, 10, 50};
    private Integer[] subArray = new Integer[]{50, 10, 65, 75};

    private ArrayUtils arrayUtils;

    @BeforeEach
    void setUp() {
        arrayUtils = new ArrayUtils<Integer>();
    }

    @AfterEach
    void tearDown() {
        arrayUtils = null;
    }

    @Test
    @DisplayName("Should Return the subset of Numbers Present in Main Array but not in Sub Array")
    public void filterAbsentNumber() {
        List<Integer> actualAbsentNumbers = arrayUtils.filterAbsent(mainArray, subArray);
        List<Integer> expectedAbsentNumbers = Arrays.asList(new Integer[]{12, 90, 100});
        Supplier<String> messageSupplier = () -> "Absent Number Mismatch, Test Failed";
        Assertions.assertEquals(expectedAbsentNumbers, actualAbsentNumbers, messageSupplier);
    }

    @Test
    @DisplayName("Should Return all the Number Present in Main Array")
    public void allNumbersOfMainArray() {
        List<Integer> actualAbsentNumbers = arrayUtils.filterAbsent(mainArray, null);
        List<Integer> expectedAbsentNumbers = Arrays.asList(new Integer[]{12, 65, 75, 90, 100, 10, 50});
        Supplier<String> messageSupplier = () -> "Absent Number Mismatch, Test Failed";
        Assertions.assertEquals(expectedAbsentNumbers, actualAbsentNumbers, messageSupplier);
    }

}