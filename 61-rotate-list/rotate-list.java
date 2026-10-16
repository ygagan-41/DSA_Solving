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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }

        //step-1: make the lsit circular and find its length
        int len = 1;

        ListNode temp = head;

        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        //becomes circular
        temp.next = head;

        //updated k
        k = k % len;

        //step-2: break the link and setup forward

        temp = head;
        for(int i=1 ; i<=len-k-1 ; i++){
            temp = temp.next;
        }
        //modified head
        ListNode forward = temp.next;

        //temp node join to null
        temp.next = null;

        //step -3 : return modified head

        return forward;
    }
}