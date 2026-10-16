/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        //step-1: findinng length of both list

        int lenA = 0;
        int lenB = 0;

        while(a != null){
            lenA++;
            a = a.next;
        }

        while(b != null){
            lenB++;
            b = b.next;
        }

        //step-2: checking which list is longer and moving head forwrad

        while(lenA > lenB){
            headA = headA.next;
            lenA--;
        }

        while(lenB > lenA){
            headB = headB.next;
            lenB--;
        }

        //step-3: both lists are now aligned so find common nodes

        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        //if there is a no common nodes
        return null;
    }
}