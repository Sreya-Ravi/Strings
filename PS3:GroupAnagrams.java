// -------------------------------------------------
// PS3: GroupAnagrams
// -------------------------------------------------

// Link : https://leetcode.com/problems/group-anagrams/

// --------------------------------------
// P R O B L E M   S T A T E M E N T 

/* Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:

Input: strs = [""]
Output: [[""]]

Example 3:

Input: strs = ["a"]
Output: [["a"]]
 

Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
*/

// --------------------------------------
// S O L U T I O N   I N   J A V A 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length==0) return new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap <>();
      
        for(String str : strs){
          
            char[] temp_arr= str.toCharArray();
            Arrays.sort(temp_arr);
          
            String temp_str= String.valueOf(temp_arr);
            if(map.containsKey(temp_str)) map.get(temp_str).add(str);
            else {
                ArrayList<String> al = new ArrayList<>();
                al.add(str);
                map.put(temp_str, al);
            }
        }
      
       return new ArrayList<>(map.values());
    }
}
