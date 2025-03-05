
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode ans=new ListNode(-1);
        ListNode dummy=ans;
        while (l1 != null && l2 != null) {
            int num1 = l1.val;
            int num2 = l2.val;
            int sum=carry+num1+num2;
            carry=0;
            if(sum>9)carry=sum/10;
              ListNode temp=new ListNode(sum-carry*10);
                ans.next=temp;
                ans=ans.next;
            // if(sum<10){
            //     ListNode temp=new ListNode(sum);
            //     ans.next=temp;
            //     ans=ans.next;
            // }else{
              
            // }
            System.out.println(sum);
            l1=l1.next;
            l2=l2.next;
        }
              while (l1 != null) {
            int num1 = l1.val;
            int sum=carry+num1;
            carry=0;
            if(sum>9)carry=sum/10;
              ListNode temp=new ListNode(sum-carry*10);
                ans.next=temp;
                ans=ans.next;
            // if(sum<10){
            //     ListNode temp=new ListNode(sum);
            //     ans.next=temp;
            //     ans=ans.next;
            // }else{
              
            // }
            System.out.println(sum);
            l1=l1.next;
        }
            while (l2 != null) {
            int num1 = l2.val;
            int sum=carry+num1;
            carry=0;
            if(sum>9)carry=sum/10;
              ListNode temp=new ListNode(sum-carry*10);
                ans.next=temp;
                ans=ans.next;
            // if(sum<10){
            //     ListNode temp=new ListNode(sum);
            //     ans.next=temp;
            //     ans=ans.next;
            // }else{
              
            // }
            System.out.println(sum);
            l2=l2.next;
        }
        if(carry!=0){
            ListNode temp=new ListNode(carry);
            ans.next=temp;
        }
        return dummy.next;
    }

    // public int getNum(ListNode l) {
    //     int num = 0;
    //     while (l != null) {
    //         num *= 10;
    //         num = num + l.val;
    //         l = l.next;
    //     }
    //     return num;
    // }

}