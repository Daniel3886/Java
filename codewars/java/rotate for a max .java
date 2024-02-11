public class MaxRotate {
    
    // Method to find the maximum number obtained after a series of rotations
    public static long maxRot(long n) {
        // Convert the input number to a string
        String number = Long.toString(n);
        // Initialize the maximum number found so far with the original number
        long max = n; 
        
        // Iterate through each digit of the number except for the last one
        for (int i = 0; i < number.length() - 1; i++) {
            // Rotate the number to the left and update the number variable
            number = rotateLeft(number, i);
            // Parse the rotated string back to a long integer
            long rotated = Long.parseLong(number); 
            // If the rotated number is greater than the current maximum, update max
            if (rotated > max) {
                max = rotated;
            }
        }
        
        // Return the maximum number found after all rotations
        return max;
    }
    
    // Method to rotate the number to the left
    private static String rotateLeft(String number, int index) {
        // Extract the prefix, suffix, and the digit at the specified index
        String prefix = number.substring(0, index);
        String suffix = number.substring(index + 1);
        // Rotate the digit at the specified index to the left
        return prefix + suffix + number.charAt(index);
    }
    
}
