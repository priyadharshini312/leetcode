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
    public int pairSum(ListNode head) {
        ListNode first=head;
        ListNode second=head;
        while(first!=null && first.next!=null){
            second=second.next;
            first=first.next.next;

        }
        ListNode prev=null;
        ListNode next=null;
        while(second!=null){
            next=second.next;
            second.next=prev;
            prev=second;
            second=next;
        }
        int max=0;
        while(prev!=null){
            int sum=prev.val+head.val;
            max=Math.max(max,sum);
            prev=prev.next;
            head=head.next;
        }
        return max;
        
    }
}