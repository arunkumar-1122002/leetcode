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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int carry=0;
       int sum;
       ListNode head=new ListNode();
       ListNode node=head;
       while(l1!=null || l2!=null)
       {
sum=(l1==null? 0:l1.val)+(l2==null? 0:l2.val)+carry;
carry=sum/10;
node.next=new ListNode(sum%10);
node=node.next;
if(l1!=null)
{
       l1=l1.next;
}
if(l2!=null)
{
       l2=l2.next;
}
       } 
     if(carry!=0)
       {
node.next=new ListNode(carry);
       }
       return head.next; 
    }
}
