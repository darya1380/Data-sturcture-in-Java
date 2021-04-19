package array;

public class ArrayRotate implements ArrayActions
{
    void rotate(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr = leftRotate(arr);
        }
    }

    private int[] leftRotate(int[] arr)
    {
        int[] newArr = new int[arr.length];
        if (newArr.length - 1 >= 0) System.arraycopy(arr, 1, newArr, 0, newArr.length - 1);
        newArr[arr.length - 1] = arr[0];
        return newArr;
    }
}
