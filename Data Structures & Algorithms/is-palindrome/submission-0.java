class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int last = s.length() - 1;  // Reads from reverse

        while(start <= last) {
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            } else if(!Character.isLetterOrDigit(s.charAt(last))){
                last--;
            } else if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(last))){ // Comapring both indexes
                return false;
            } else {
                start++;
                last--;
            }
        }
                return true;
    }
}
