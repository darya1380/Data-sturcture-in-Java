package array;

import java.util.Arrays;
import java.util.Collections;

public class MaximumValueOfIMultipliesArriUsingRotationOnly
{
    public int findMaximumValue(Integer[] arr)
    {
        int maxSum = Integer.MIN_VALUE;
        int rotation = arr.length - 1;
        ArrayRotate r = new ArrayRotate();

        for (int i = 0; i < rotation; i++) {
            int[] arrCpy = new int[arr.length];
            for (int j = 0; j < arr.length; j++) {
                arrCpy[i] = arr[i];
            }
            arrCpy = r.rotate(arrCpy, i);
            int sum = findSum(arrCpy);
            if(sum > maxSum)
                maxSum = sum;
        }
        return maxSum;
    }

    private int findSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
