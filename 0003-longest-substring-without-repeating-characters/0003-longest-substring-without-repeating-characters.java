class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Array to store the last seen index + 1 of each character.
        // 128 covers all standard ASCII characters.
        int[] lastSeen = new int[128];
        
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);
    
            left = Math.max(left, lastSeen[currChar]);

            maxLength = Math.max(maxLength, right - left + 1);
            
            lastSeen[currChar] = right + 1;
        }
        
        return maxLength;
    }
}
