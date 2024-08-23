package org.example;

import java.util.Arrays;

public class DynamicArray {
    Integer[] arrayValues;

    public DynamicArray(int capacity) {
        arrayValues = new Integer[capacity];
    }

    public void set(int index, Integer value) {
        arrayValues[index] = value;

    }
    public int get(int index) {
        return arrayValues[index];
    }
    
    public int getCapacity(){
        return arrayValues.length;
    }

    public void pushback(int pushbackIndex){
        var value = get(pushbackIndex);
        var lastIndex =  getCapacity() -1;
        set(lastIndex, value);
        set(pushbackIndex, null);
    }

    public int popback(){
        int lastIndex = getCapacity() - 1;
        int lastValue = arrayValues[lastIndex];
        arrayValues = Arrays.copyOf(arrayValues, lastIndex);
        return lastValue;
    }
}
