public class Solution {
  public String longestPalindrome(String s) {
    String max = "";

    // looking for sub palindrome string with length
    // max + 1 or max + 2. it is impossible to have 
    // max + 3 or longer becuase it should already 
    // been discovered previsouly. 


    for (int i = 0; i < s.length(); i++) {

      if(isPalindorme(s, i - max.length() - 1, i) 
        max = s.substring(i-max.length() - 1, i + 1);
      else if(isPalindorme(s, i - max.length(), i) 
        max = s.substring(i-max.length(), i + 1);

    }
    
    return max;

  }

  private boolean isPalindorme(String s, int i, int j) {
    if (i < 0) return false;
    while (i < j)
      if(s.charAt(i++) != s.charAt(j--)) return false;
    return true;
  }
}
