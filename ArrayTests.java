import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input2 = { 3, 4, 3 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3, 4, 3}, input2);
  }
  
  @Test 
  public void testReverseInPlace3() {
    int[] input3 = { 3, 5 };
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 5, 3}, input3);
  }

  @Test 
  public void testReversed2() {
    int[] input2 = { 1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void averageWithoutLowest() {
    double[] input5 = { 2.0, 10.0, 5.0 };
    assertEquals(7.5, ArrayExamples.averageWithoutLowest(input5), 0.1);
  }
}
