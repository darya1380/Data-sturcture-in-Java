package array;

import java.util.Arrays;
import java.util.Collections;

public class MaximumValueOfIMultipliesArriUsingRotationOnly
{
    //safely replaced solution
        public int findMaxVal(Integer[] arr)
        {
            int sum = 0;
            for (int j : arr) {
                sum += j;
            }
            int curr = 0;
            int maxVal = Integer.MIN_VALUE;
            for (int i = 1; i < arr.length; i++)
            {
                curr = curr + sum - arr.length * arr[arr.length - i];
                if(curr > maxVal)
                    maxVal = curr;
            }
            return maxVal;

        }
}
