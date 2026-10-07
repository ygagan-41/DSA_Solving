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
    public ListNode solve(ListNode prev , ListNode curr){
        //base case
        if(curr == null){
            return prev;
        }

        //1 - case hum baaki recursion
        ListNode forward = curr.next;
        curr.next = prev;
        prev = curr;
        curr = forward;

        //recursive call
        ListNode ans = solve(prev,curr);
        return ans;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode ans = solve(prev, curr);
        return ans;
    }
}