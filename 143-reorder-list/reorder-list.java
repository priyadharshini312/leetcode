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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode curr=slow.next;
        slow.next=null;
        while(curr!=null){
            ListNode move=curr.next;
            curr.next=prev;
            prev=curr;
            curr=move;

        }
        ListNode temp1=head;
        ListNode temp2=prev;
        while(temp2!=null){
        ListNode next1=temp1.next;
        ListNode next2=temp2.next;
        temp1.next=temp2;
        temp2.next=next1;
        temp1=next1;
        temp2=next2;
        }

        
        //return dummy.next;

    }
}