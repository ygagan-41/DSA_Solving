
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        int lenA = 0;
        int lenB = 0;

        // Calculate the length of List A
        while (a != null) {
            lenA++;
            a = a.next;
        }

        // Calculate the length of List B
        while (b != null) {
            lenB++;
            b = b.next;
        }

        // Move the longer list's head forward
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Now both pointers are aligned
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}
