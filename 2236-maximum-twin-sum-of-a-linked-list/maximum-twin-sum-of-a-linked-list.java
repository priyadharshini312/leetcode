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
        ListNode temp=null;
        ListNode store=second;
        while(store!=null){
            ListNode temp1=store.next;
            store.next=temp;
            temp=store;
            store=temp1;
        }
        int max=0;
        ListNode one=head;
        ListNode two=temp;
        while(two!=null){
            int sum=one.val+two.val;
            max=Math.max(max,sum);
            one=one.next;
            two=two.next;
        }
        return max;
        
    }
}