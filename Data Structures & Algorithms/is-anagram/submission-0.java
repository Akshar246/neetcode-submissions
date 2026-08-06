class Solution {
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;  // different lengths can't be anagrams

    int[] count = new int[26];  // one slot per letter a-z

    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;  // increase count for s's letter
        count[t.charAt(i) - 'a']--;  // decrease count for t's letter
    }

    for (int c : count) {
        if (c != 0) return false;  // if any letter count isn't balanced, not an anagram
    }

    return true;
}
}
