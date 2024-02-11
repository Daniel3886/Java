public class Solution {
    
    // Method to calculate the product array
    public static long[] productArray(int[] numbers) {
        // Calculate the product of all elements in the input array
        long product = 1;
        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i];
        }

        // Initialize the result array
        long[] result = new long[numbers.length];
        
        // Calculate each element of the result array
        for (int i = 0; i < numbers.length; i++) {
            // Divide the product by the current element to get the result
            result[i] = product / numbers[i];
        }

        // Return the result array
        return result;
    }
}
