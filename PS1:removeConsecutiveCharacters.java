// -------------------------------------------------
// PS1:removeConsecutiveCharacters
// -------------------------------------------------

// Link : https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1

// --------------------------------------
// P R O B L E M   S T A T E M E N T 

/* Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

Example 1:

Input:
S = aabb
Output:  ab 
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
Similiar explanation for b at
4th position.

Example 2:

Input:
S = aabaa
Output:  aba
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
'a' at fifth position is appearing
2nd time consecutively.
 

Your Task:
You dont need to read input or print anything. 
Complete the function removeConsecutiveCharacter() which accepts a string as input parameter and returns modified string.
 

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).
 

Constraints:
1<=|S|<=105
All characters are lowercase alphabets. */


// --------------------------------------
// S O L U T I O N   I N   J A V A 


class Solution{
    public String removeConsecutiveCharacter(String s){
        String news=s.substring(0,1);
        for (int i=1;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=s.charAt(i-1))  news +=c;
        }
        return news;
    }
}

// --------------------------------------
