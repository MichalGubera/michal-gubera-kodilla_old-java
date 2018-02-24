package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperationsBU.getAverage;

public class ArrayOperationsTestSuiteBU {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[20];
        for (int i=0; i<numbers.length; i++){
            numbers [i] = i+1;
        }

        //When
        double average = getAverage(numbers);

        //Then
        Assert.assertEquals(10.5, average, 0);
    }
}
