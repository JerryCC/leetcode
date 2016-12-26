public class Solution{
  
  public int solution(int[] nums) {
  
    int ans = 0;
  
    for (int i = 32; i >= 0; i--) {
      
      int ones = 0; 
      // we count the number of integers in num
      // that has 1 one the ith digit 
    
      for (int j : nums) {
        ones += (j >> i) & 1;
        // (j>>i) & 1 = 1 when the ith digit is 1
      }    
        ans += ones * (nums.length - ones);
        // zeros * ones = total diff
    }
    return ans;
  }
}
