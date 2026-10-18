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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        for(int i=1; i<=k-1; i++){
            first = first.next;
        }
        ListNode temp = first.next;
        ListNode second = head;

        while(temp != null){
            second = second.next;
            temp = temp.next;
        }

        int tempval = first.val;
        first.val = second.val;
        second.val = tempval;

        return head;
    }
}