/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null){
            if(prev.val != curr.val){
                //dono ko ek ek step aage badha do
                prev = prev.next;
                curr = curr.next;
            }
            else{
                //agar dono equal hai toh prev.next ki link connect kardo
                //to curr.next
                prev.next = curr.next;
                curr = curr.next;
            }
        }
        return head;
    }
}