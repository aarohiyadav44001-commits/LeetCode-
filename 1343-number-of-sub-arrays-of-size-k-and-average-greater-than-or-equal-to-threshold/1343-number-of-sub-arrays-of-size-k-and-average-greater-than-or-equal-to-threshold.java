class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        int target = threshold * k; // Avoids integer division later
        
        // 1. Calculate sum of the first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        
        // 2. Check the first window
        if (sum >= target) {
            count++;
        }
        
        // 3. Slide the window across the array
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i]; 
            if (sum >= target) {
                count++;
            }
        }
        return count;
    }
}
