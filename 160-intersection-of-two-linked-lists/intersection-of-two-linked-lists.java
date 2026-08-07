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
        ListNode temp=headA;
        for(temp=headA;temp!=null;temp=temp.next){
            for(ListNode temp1=headB;temp1!=null;temp1=temp1.next){
                if(temp==temp1){
                    return temp;
                }
            }
        }
        return null;
    }
}