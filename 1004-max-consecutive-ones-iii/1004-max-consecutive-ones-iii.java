class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int zeroCount = 0; 
        int maxStreak = 0; 
        for (int end = 0; end < nums.length; end++) {

            if (nums[end] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[start] == 0) {
                    zeroCount--; 
                }
                start++; 
            }
            int currentWindowLength = end - start + 1;
            maxStreak = Math.max(maxStreak, currentWindowLength);
        }
        
        return maxStreak;
    }
}
