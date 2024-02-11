public class Kata {
    
    // Method to invert the sign of each element in the array
    public static int[] invert(int[] array) {
        // Iterate through each element of the array
        for (int i = 0; i < array.length; i++) {
            // Invert the sign of the element
            array[i] = -array[i];
        }
        // Return the modified array
        return array;
    }
}
