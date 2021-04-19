package tests;

import array.MaximumValueOfIMultipliesArriUsingRotationOnly;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMaximumValue
{
    @Test
    public void testValue()
    {
        Integer[] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = 5 - i;
        }
        MaximumValueOfIMultipliesArriUsingRotationOnly m = new MaximumValueOfIMultipliesArriUsingRotationOnly();
        assertNotEquals(m.findMaxVal(arr), 43);
    }
}
