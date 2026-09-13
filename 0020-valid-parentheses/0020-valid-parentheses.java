class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();  // created an empty stack
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '{' || c == '[') {  // it's an opening bracket
                stack.push(c);  // push it onto the stack
            } else {  // it's a closing bracket
                if (stack.isEmpty()) {  // stack is empty
                    return false;
                }
                
                char top = stack.pop();  // get the top element and pop it too
                
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;  // no match
                }
            }
        }
        
        return stack.isEmpty();  // check if stack is empty at the end or not
    }
}