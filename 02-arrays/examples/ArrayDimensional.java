/**
 * This example demonstrates the use of multidimensional arrays in Java.
 * It includes defining a 2D array, accessing and modifying elements,
 * and iterating through the array using nested loops.
 */

import java.util.Arrays;

public class ArrayDimensional
{
    public static void main(String[] args)
    {
        // Define a 2D array
        int[][] matrix =
        {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Print the whole matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Access elements
        System.out.println("\nAccess Elements:");
        System.out.println("Top-left: " + matrix[0][0]);
        System.out.println("Middle: " + matrix[1][1]);
        System.out.println("Bottom-right: " + matrix[2][2]);

        // Modify an element
        matrix[0][0] = 99;
        System.out.println("\nAfter Modification:");
        for (int j = 0; j < matrix[0].length; j++)
        {
            System.out.print(matrix[0][j] + " ");
        }
        System.out.println();

        // Iterate with indices
        System.out.println("\nIterating with indices:");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }
    }
}