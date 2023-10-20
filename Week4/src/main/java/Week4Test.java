import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        assertEquals(Week4.max2Int(2, -5), 2);
        assertEquals(Week4.max2Int(-5, 0), 0);
        assertEquals(Week4.max2Int(0, 0), 0);
    }

    @Test
    public void testMax2Int2() {
        assertEquals(Week4.max2Int(Integer.MAX_VALUE, Integer.MAX_VALUE - 1), Integer.MAX_VALUE);
        assertEquals(Week4.max2Int(Integer.MIN_VALUE, Integer.MIN_VALUE + 1), Integer.MIN_VALUE + 1);
    }

    @Test
    public void testMax2Int3() {
        assertEquals(Week4.max2Int(Integer.MIN_VALUE, Integer.MAX_VALUE), Integer.MAX_VALUE);
    }

    @Test
    public void testMax2Int4() {
        assertEquals(Week4.max2Int(Integer.MIN_VALUE, 0), 0);
        assertEquals(Week4.max2Int(Integer.MAX_VALUE, 0), Integer.MAX_VALUE);
    }

    @Test
    public void testMax2Int5() {
        assertEquals(Week4.max2Int(0, Integer.MIN_VALUE), 0);
        assertEquals(Week4.max2Int(0, Integer.MAX_VALUE), Integer.MAX_VALUE);
    }

    @Test
    public void testMinArray1() {
        assertEquals(Week4.minArray(new int[]{ 1 }), 1);
        assertEquals(Week4.minArray(new int[]{ 0 }), 0);
    }

    @Test
    public void testMinArray2() {
        assertEquals(Week4.minArray(new int[]{ Integer.MIN_VALUE }), Integer.MIN_VALUE);
        assertEquals(Week4.minArray(new int[]{ Integer.MAX_VALUE }), Integer.MAX_VALUE);
    }

    @Test
    public void testMinArray3() {
        assertEquals(Week4.minArray(new int[]{ 1, 2, 3, -1, -2, -3 }), -3);
        assertEquals(Week4.minArray(new int[]{ 1, 2, 3, -1, -2, 9 }), -2);
        assertEquals(Week4.minArray(new int[]{ 0, 2, 3, 4, 5, 6, 7, 8 }), 0);
    }

    @Test
    public void testMinArray4() {
        assertEquals(Week4.minArray(new int[]{ Integer.MIN_VALUE, -1, 0, 1 }), Integer.MIN_VALUE);
        assertEquals(Week4.minArray(new int[]{ Integer.MAX_VALUE, -1, 0, 1 }), -1);
    }

    @Test
    public void testMinArray5() {
        assertEquals(Week4.minArray(new int[]{ Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE }), Integer.MIN_VALUE);
        assertEquals(Week4.minArray(new int[]{ Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE }), Integer.MAX_VALUE);
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals(Week4.calculateBMI(80, 1.8), "Thừa cân");
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals(Week4.calculateBMI(80, 1.5), "Béo phì");
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals(Week4.calculateBMI(70, 1.8), "Bình thường");
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals(Week4.calculateBMI(50, 1.8), "Thiếu cân");
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals(Week4.calculateBMI(51.7, 1.5), "Thừa cân");
    }
}