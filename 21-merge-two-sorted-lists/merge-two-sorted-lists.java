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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);

        ListNode anshead = dummy;
        ListNode anstail = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                anstail.next = list1;
                list1 = list1.next;
                anstail = anstail.next;
            }
            else{
                anstail.next = list2;
                list2 = list2.next;
                anstail = anstail.next;
            }
        }

        if(list1 != null){
            anstail.next = list1;
        }
        if(list2 != null){
            anstail.next = list2;
        }

        anshead = anshead.next;
        dummy.next = null;
        return anshead;
    }
}