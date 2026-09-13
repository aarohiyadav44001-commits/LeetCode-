class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];  // to count frequency of each letter (A-Z)
        int left = 0;               // left pointer of window
        int maxCount = 0;           // count of the most frequent character in current window
        int maxLength = 0;    
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count[c - 'A']++;                          // add current character to window
            maxCount = Math.max(maxCount, count[c - 'A']); // update most frequent count
            
            // window size = right - left + 1
            // if (window size - maxCount) > k, window is invalid, shrink it
            if ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;  // remove leftmost character from window
                left++;                          // shrink window from left
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}