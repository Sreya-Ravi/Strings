// -------------------------------------------------
// PS4: ValidParantheses
// -------------------------------------------------

// Link : https://leetcode.com/problems/valid-parentheses/

// --------------------------------------
// P R O B L E M   S T A T E M E N T 

/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false
 
Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

// --------------------------------------
// S O L U T I O N   I N   J A V A 

class Solution {
    public boolean isValid(String s) {
      
        Stack <Character> stack0=new Stack<Character>();
      
        if (s.length()%2!=0) return false;
      
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c=='{' || c=='[' || c=='(') stack0.push(c);
            else if (!stack0.empty() && c==')' && stack0.peek()=='(') stack0.pop();
            else if (!stack0.empty() && c==']' && stack0.peek()=='[') stack0.pop();
            else if (!stack0.empty() && c=='}' && stack0.peek()=='{') stack0.pop();
            else return false;
        }
      
        return stack0.empty();
    }
}
