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
    public ListNode partition(ListNode head, int x) {
        ListNode greaterhead = new ListNode(-1);
        ListNode greatertail = greaterhead;

        ListNode lesserhead = new ListNode(-1);
        ListNode lessertail = lesserhead;

        ListNode temp = head;

        while(temp != null){

            if( x > temp.val){
                lessertail.next = temp;
                lessertail = lessertail.next;
                temp = temp.next;
            }
            else{
                greatertail.next = temp;
                greatertail = greatertail.next;
                temp = temp.next;
            }
        }
        lessertail.next = greaterhead.next;
        greatertail.next = null;
        lesserhead = lesserhead.next;
        return lesserhead;
    }
}