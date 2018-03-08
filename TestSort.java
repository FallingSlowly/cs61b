import java.util.Arrays;
import org.junit;

/**
 * TestSort
 */
public class TestSort {
    public static void testSort() {
        String[] input = {"I", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "I"};

        Sort.sort(input);

        org.junit.Assert.assertEquals(expected, input);
    }

    public static void testFindSmallest() {
        String[] input = {"I", "have", "an", "egg"};
        int expected = 2;

        int actual = Sort.findSmallest(input, 0);
        org.junit.Assert.assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "pigs"};
        int expected2 = 1;

        int actual2 = Sort.findSmallest(input2, 2);
        org.junit.Assert.assertEquals(expected2, actual2);
    }

    public static void testSwap() {
        String[] input = {"I", "have", "an", "egg"};
        
        int a = 0;
        int b = 2;

        String[] expected = {"an", "egg", "have", "I"};

        Sort.swap(input, a, b);

        org.junit.Assert.assertEquals(expected, input);
    }

    public static void main(String[] args) {
        testFindSmallest();
        testSwap();
    }    
}