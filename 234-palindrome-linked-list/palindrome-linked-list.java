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
    public boolean isPalindrome(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode next=dummy;
        ListNode temp=head;
        while(temp!=null){
            next.next=new ListNode(temp.val);
            next=next.next;
            temp=temp.next;
        }
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        while(prev!=null && dummy.next!=null){
          if(dummy.next.val!=prev. val){
            return false;
        }
        prev=prev.next;
        dummy=dummy.next;
        }
        return true;
    }
}

        