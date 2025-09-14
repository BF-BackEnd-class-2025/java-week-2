/**
 * This example demonstrates the use of arrays in Java.
 */

import java.util.Arrays;

public class Array
{

    public static void main(String[] args)
    {
        // 1. Declaring and initializing an array
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Accessing elements by index
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // 3. Traversing an array with a for loop
        System.out.print("All elements: ");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 4. Traversing with enhanced for loop
        System.out.print("Using enhanced for loop: ");
        for (int num : numbers)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Using Arrays utility class
        System.out.println("Array as string: " + Arrays.toString(numbers));

        // 6. Modifying array elements
        numbers[2] = 99; // change the 3rd element
        System.out.println("After modification: " + Arrays.toString(numbers));

        // 7. Sorting an array
        int[] unsorted = {42, 7, 19, 73, 5};
        Arrays.sort(unsorted);
        System.out.println("Sorted array: " + Arrays.toString(unsorted));

        // 8. Copying an array
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copy));
    }
}
