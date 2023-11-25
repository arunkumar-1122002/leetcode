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
/*leetcode21 -merge two sorted linked list-easy(using merge short algorithm)*/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
        return null;
        ListNode mix=new ListNode();
        ListNode head=mix;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val)
            {
                mix.next=new ListNode(list1.val);
            list1=list1.next;
            }
else{
    mix.next=new ListNode(list2.val);
    list2=list2.next; 
}
mix=mix.next;
}
while(list1!=null)
{
mix.next=new ListNode(list1.val);
list1=list1.next;
mix=mix.next;
}
while(list2!=null)
{
mix.next=new ListNode(list2.val);
 list2=list2.next;
 mix=mix.next;
}
        return head.next;
    }
}
