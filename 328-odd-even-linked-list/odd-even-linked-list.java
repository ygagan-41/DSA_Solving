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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //creating nodes

        ListNode oddhead = head;
        ListNode oddtail = head; 

        ListNode eventail = head.next;
        ListNode evenhead = head.next;
        //now arrange links
        while(eventail != null && eventail.next != null){

            //joining odd nodes together
            oddtail.next = eventail.next;
            oddtail = eventail.next;

            //joining even nodes together
            eventail.next = oddtail.next;
            eventail = oddtail.next;
        }
        //joining oddtail to evenhead
        oddtail.next = evenhead;
        return oddhead;
    }
}