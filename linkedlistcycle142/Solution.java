public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if (head == null) return null;
        
        ListNode meet   = null;
        ListNode walker = head;
        ListNode runner = head;
        
        while (runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner) {
                meet = runner;
                break;
            }
        }
        // Let the meet point be k from head;
        // circle has length r;
        // start of circle s from head;
        // meet point m from start of circle;
        // runner take two steps a time
        // so when runner and walker meets, runner took 2k steps;
        // 2k - k covers the circle n times;
        // k = n * r; k = s + m
        // n * r = s + m
        // s = n * r - m
        // thus, starting from the meeting point and head, 
        // two pointers take one step a time
        // and they will meet at the start of the circle,
        // the meeting pointer might goes over the circle n times
        if (meet == null) return null;
        
        while (meet != head) {
            meet = meet.next;
            head = head.next;
        }
        
        return head;
        
        
    }
}