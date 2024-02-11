class Solution {
    
    // Method to find the sum of elements that appear exactly once in the array
    public static int repeats(int[] arr) {
        int sum = 0; // Initialize the sum
        
        // Iterate through each element of the array
        for (int i = 0; i < arr.length; i++) {
            int count = 0; // Initialize the count of occurrences of the current element
            
            // Iterate through each element of the array again to count occurrences
            for (int j = 0; j < arr.length; j++) {
                // If the current element is equal to the current element being checked
                if (arr[i] == arr[j]) {
                    count++; // Increment the count
                }
            }
            
            // If the count of occurrences is 1 (element appears exactly once)
            if (count == 1) {
                sum += arr[i]; // Add the element to the sum
            }
        }
        
        // Return the sum of elements that appear exactly once
        return sum;
    }
}
