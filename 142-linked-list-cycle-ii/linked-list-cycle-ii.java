/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean hascycle = false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
                slow = slow.next;
            }

            if(fast == slow){
                hascycle = true;
                break;
            }
        }
        if(!hascycle){
            return null;
        }
        slow = head;

        //jab tak dono equal nahi hojate ek ek step move karo
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}