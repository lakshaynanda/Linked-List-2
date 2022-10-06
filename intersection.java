
// TC: O(n + m) n = length of list A and m = length of list B
// SC: O(1) 
// Solved on leetcode
// No problem faced
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode curr = headA;
        int lenA = 0;
        int lenB = 0;
        
        while (curr != null) {
            lenA++;
            curr = curr.next;
        }
        
        curr = headB;
        while (curr != null) {
            lenB++;
            curr = curr.next;
        }
        
        while(lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        
        while(lenB > lenA) {
            headB = headB.next;
            lenB--;
        }
        
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
}
