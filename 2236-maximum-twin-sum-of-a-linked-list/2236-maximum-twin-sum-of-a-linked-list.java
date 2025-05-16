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


 // There is another way where we can find the mid of LL using slow and fast pointer . and then reverse second part of LL and now keeping adding val of each LL and keep track of max
class Solution {
    public int pairSum(ListNode head) {
        ListNode temp=head;int count=0,max=0;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        int arr[]= new int[count];
        temp=head;
        for(int i=0;i<count;i++) {
            arr[i]=temp.val;
            temp=temp.next;
        }
        for(int i=0;i<count/2;i++) {
            max=Math.max(arr[i]+arr[count-i-1],max);
        }
        return max;


    }
}