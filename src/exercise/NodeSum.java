package exercise;

import exercise.utils.ListNode;

public class NodeSum {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.append(new ListNode(4)).append(new ListNode(5));
        ListNode l2 = new ListNode(5);
        l2.append(new ListNode(6)).append(new ListNode(4));
        //l1.show();
        //l2.show();
        addTwoNumbers(l1,l2).show();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int x=0;
        int y=0;
        int carry=0;
        int sum=0;
        //哑结点
        ListNode head=new ListNode(0);
        ListNode p=l1;
        ListNode q=l2;
        ListNode curr=head;
        while (p!= null || q != null) {
            if (p!=null){
                x=p.data;
            }else{
                x=0;
            }
            if (q!=null){
                y=q.data;
            }else {
                y=0;
            }
            sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if (p!=null)p=p.next;
            if (q!=null)q=q.next;
        }
        if (carry>0){
            curr.next=new ListNode(carry);
        }
        return head.next;
    }
}
