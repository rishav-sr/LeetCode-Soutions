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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
        return head;
        ListNode slow=head,temp=head;
        ListNode fast=head.next,temp2=head.next,head2=head.next;
        while(slow.next!=null&&fast.next!=null) {
            slow=slow.next.next;
            fast=fast.next.next;
            temp.next=slow;
            temp=slow;
            temp2.next=fast;
            temp2=fast;
        }
        temp.next=head2;
        return head;
    }
}