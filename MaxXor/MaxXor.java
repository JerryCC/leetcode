public class MaxXor {

  public int solution (int[] nums) {
    
    int max = 0, mask =0;
    // store max value && select bits to perform XOR
    
    for (int i = 31; i >= 0; i--) {
      
      mask |= (1 << i) // ith most significant bit
      Set<Integer> set = new HashSet<Integer>();
      
      for (int j : nums) set.add(j & mask);
      // we only care about the maxium 
      
      int temp = max | (1 << i);
      // biggest possible in the ith bit

      for (int k : set) {
        if (set.contains(k^temp)){
          max = temp; 
          //if k^temp exists, then there exists a k that satisifies the question
        }
      }
    }
    return max;

  }   

}
