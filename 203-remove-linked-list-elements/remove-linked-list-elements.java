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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy  = new ListNode(-1);
        ListNode ansHead = dummy;
        ListNode ansTail = dummy;

        ListNode temp = head;

        while(temp!= null){
            if(temp.val != val){
                ansTail.next = temp;
                temp = temp.next;
                ansTail = ansTail.next;
            }
            else{
                //if they are equal
                temp = temp.next;
            }
        }
        ansTail.next = null;
        //now remove dummynode
        ansHead = ansHead.next;
        dummy.next = null;
        return ansHead;
    }
}