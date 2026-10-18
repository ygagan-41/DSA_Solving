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
    public ListNode getmiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null){
            fast = fast.next;
            if(fast.next != null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
    public ListNode merge(ListNode l1 , ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode anshead = dummy;
        ListNode anstail = dummy;

        while(l1 != null && l2 != null){
            if(l1.val >= l2.val){
                anstail.next = l2;
                anstail = anstail.next;
                l2 = l2.next;
            }
            else{
                anstail.next = l1;
                anstail = anstail.next;
                l1 = l1.next;
            }
        }

        if(l1 != null){
            anstail.next = l1;
        }
        if(l2 != null){
            anstail.next = l2;
        }

        anshead = anshead.next;
        return anshead;
    }
    public ListNode sortList(ListNode head) {
        //base case
        if(head == null || head.next == null){
            return head;
        }

        //get middle point and breaking the list
        ListNode middle = getmiddle(head);
        ListNode l2 = middle.next;
        middle.next = null;

        //sort list
        ListNode l1 = sortList(head);
        l2 = sortList(l2);

        //merging list after sorting
        return merge(l1,l2);
    }
}