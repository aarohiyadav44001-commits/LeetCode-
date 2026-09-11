class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         int n = cleaned.length();
        for(int i=0; i < n/2; i++){
           if(cleaned.charAt(i) != cleaned.charAt(n-1-i)){
            return false;
           } 
        }
        return true;
    }
}