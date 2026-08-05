/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        /*if(head.val==node.val){
            return head.next;
        }
        ListNode temp=head.next;
        ListNode prev=head;
        while(temp!=null && temp.val!=node.val){
            temp=temp.next;
            prev=prev.next;
        }
        if(temp==null){
            return head;
        }
        prev.next=temp.next;
        return head;*/
        node.val=node.next.val;
        node.next=node.next.next;

    }
}