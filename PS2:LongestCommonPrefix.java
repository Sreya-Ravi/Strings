// -------------------------------------------------
// PS2: LongestCommonPrefix
// -------------------------------------------------

// Link : https://leetcode.com/problems/longest-common-prefix/

// --------------------------------------
// P R O B L E M   S T A T E M E N T 

/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters. */


// --------------------------------------
// S O L U T I O N   I N   J A V A 

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length==1) return strs[0];
        String res=strs[0];
        int count=0;
//         find lowest len str 
        String min_str=strs[0];
        for (String s : strs){
            if ( s.length() < min_str.length()) min_str=s;
        }
//         traverse strs : i : 0--> n
        for(int i=0;i<strs.length;i++){    
                String s= strs[i];
          
//         compare c=(min_str, str[i]) --> res=min(c)
            for(int j=min_str.length();j>0;j--){
              
                if(!s.substring(0,j).equals(min_str.substring(0,j))) continue;
              
                else if (s.substring(0,j).length()<=res.length()) {
                    res=s.substring(0,j);
                    count++;
                    break;
                }
                else if (j==0)  return "";  
            }
        }
        if (count==strs.length) return res;
        return "";
        
    }
}

// --------------------------------------
