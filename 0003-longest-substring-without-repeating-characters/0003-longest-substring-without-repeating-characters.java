class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Array to store the last seen index + 1 of each character.
        // 128 covers all standard ASCII characters.
        int[] lastSeen = new int[128];
        
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);
            
            // If the character was seen inside or to the right of the current 'left' boundary,
            // jump 'left' directly past its previous occurrence.
            left = Math.max(left, lastSeen[currChar]);
            
            // Calculate window length and update max
            maxLength = Math.max(maxLength, right - left + 1);
            
            // Store the next index (right + 1) to mark where left should jump if duplicated
            lastSeen[currChar] = right + 1;
        }
        
        return maxLength;
    }
}
