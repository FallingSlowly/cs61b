import java.util.Arrays;

/**
 * TestSort
 */
public class TestSort {
    public static void testSort() {
        Strict[] input = {"I", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "I"};

        Sort.sort(input);

        for (int i = 0; i< input.length; i += 1) {
            if (!input[i].equals(expected[i])) {
                System.out.println("Mismatch in position" + i + ", expected: " + expected[i] + ", but got: " + input[i]);
            return;
            }
        }

        if (Arrays.equals(input, expected)) {
            System.out.println("Error!");
        }

    }


    public static void main(String[] args) {
        testSort();
    }    
}