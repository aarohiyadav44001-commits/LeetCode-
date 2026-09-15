class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.length() > 0 && s.indexOf(part) < s.length()) {
            int startIndex = s.indexOf(part); 
            if (startIndex == -1) {
                break;
            }
            int endIndex = startIndex + part.length();
            s = s.substring(0, startIndex) + s.substring(endIndex);
        }
        return s;
    }
}
