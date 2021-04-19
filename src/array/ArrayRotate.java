package array;

public class ArrayRotate implements ArrayActions
{
    public int[] rotate(int[] arr, int numberOfRotateTime)
    {
        for (int i = 0; i < numberOfRotateTime; i++)
        {
            arr = leftRotate(arr);
        }
        return arr;
    }

    private int[] leftRotate(int[] arr)
    {
        int[] newArr = new int[arr.length];
        if (newArr.length - 1 >= 0) System.arraycopy(arr, 1, newArr, 0, newArr.length - 1);
        newArr[arr.length - 1] = arr[0];
        return newArr;
    }
}
