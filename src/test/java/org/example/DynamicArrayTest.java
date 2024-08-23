package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {
    Random rnd = new Random();

    @Test
    void getReturnSetValue() {
        var arr = new DynamicArray(10);
        arr.set(0, 999);
        assertThat(arr.get(0)).isEqualTo(999);
    }

    @Test
    void getCapacityTest() {
        //preparation
        int capacity = rnd.nextInt(10,100);
        var arr = new DynamicArray(capacity);
        //execution
        var value = arr.getCapacity();
        //assertion
        assertThat(value).isEqualTo(capacity);
    }

    @Test
    void pushbackTest() {
        // preparation
        int capacity = rnd.nextInt(10, 100);
        var arr = new DynamicArray(capacity);
        arr.set(4, 35);
        //execution
        arr.pushback(4);
        //assertion
        assertThat(arr.get(capacity-1)).isEqualTo(35);
        assertThat(arr.get(4)).isZero();
    }
    @Test
    void popbackTest() {
        // preparation
        int capacity = rnd.nextInt(10, 100);
        var arr = new DynamicArray(capacity);
        var lastElementValue = 5;
        var lastElementIndex = capacity - 1;
        arr.set(lastElementIndex, lastElementValue);
        //execution
        int returnedVlue = arr.popback();
        //assertion
        assertThat(returnedVlue).isEqualTo(lastElementValue);
        assertThat(arr.getCapacity()).isEqualTo(capacity - 1);
    }
    @Test
    void sampleTest() {
        // preparation
        //execution
        //assertion
    }

}