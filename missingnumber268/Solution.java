public class Solution {
  public int missingnumber(int[] nums) {
    int res = 0;
    for (int i = 0; i < nums.length; i++) 
      res ^= i ^ nums[i];
    return res ^ nums.length;
  }

  // this solution is based on the fact that 
  // a ^ b ^ b = a, so if a is missing, we have
  // 0 ^ 0 ^ 0 ^ 1 ^ 1 ^ ... a-1 ^ a-1 ^ a ^ a+1 ^ a+1...
  // ^ n ^ n = a
}
