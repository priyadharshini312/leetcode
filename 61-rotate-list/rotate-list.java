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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||k==0){
            return head;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        k=k%count;
        if(k == 0){
       return head;
       }
        ListNode index=head;
        for(int i=0;i<count-k-1;i++){
             index=index.next;
        }
        ListNode head1=index.next;
        index.next=null;
        ListNode temp1=head1;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=head;
        return head1;
    }
}

