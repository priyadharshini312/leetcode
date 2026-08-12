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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int  stop=count-n;
        ListNode prev=head;
        if(stop==0){
            return head.next;
        }
        for(int i=0;i<stop-1;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}