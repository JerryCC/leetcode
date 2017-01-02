public class Solution {
  public boolean hasCycle(ListNode head) {
    if (head == null) return false;

    ListNode walker = head;
    ListNode runner = head;
    
    //if there is a cycle, eventually two pointers will meet.
    while (runner.next != null && runner.next.next != null) {
      walker = walker.next;
      runner = runner.next;
      if (walker == runner) return true;
    }

    return false;
  }
}
