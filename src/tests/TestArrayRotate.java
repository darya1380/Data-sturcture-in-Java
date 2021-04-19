package tests;
import array.ArrayRotate;
import org.junit.*;
import static org.junit.Assert.*;
public class TestArrayRotate
{
    @Test
    public void test()
    {
        ArrayRotate rotate = new ArrayRotate();
        int[] arr = {
                1, 2, 3, 4, 5
        };
        int[]expected = {
                2, 3, 4, 5, 1
        };
        assertArrayEquals(expected, rotate.rotate(arr, 1));
    }
}
