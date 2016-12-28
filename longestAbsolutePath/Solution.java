public class Solution {

  public int longestAbsolutePath(String input) {
    
    Stack<Integer> st = new Stack();

    int max = 0;

    st.push(0);

    for (String s : input.split("\n"))  {

      int slen = s.replace("\t", "").length);

      // depth in the file system
      int level = s.length() - slen;

      // finding parent string
      while (level + 1 < st.size()) 
        st.pop();

      // following 3 lines: getting current length 
      int cur = slen + st.peek();

      if (level >= 1) 
        cur++;

      // if there is a file
      if (s.contains("."))
        max = cur > max ? cur : max;
      
      st.push(cur);

    }

      return max;

  }

}
