// A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

// Example 1:

// Input:
// LinkedList: 4->5->6
// Output: 457
// Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457. 
// Example 2:

// Input:
// LinkedList: 1->2->3
// Output: 124 

class Solution
{
    
    static Node reverse(Node head) {  //fiunction to reverse
        Node dummy=null;
        while(head!=null) {
            Node temp=new Node(head.data);
            temp.next=dummy;
            dummy=temp;
            head=head.next;
        }
        return dummy;
    }
    public static Node addOne(Node head) 
    { 
        head=reverse(head); //reverse th e LL first
        Node temp=head;
        int carry=1;
        while(temp!=null) {// go on traversing and add the and keep on track on carry
            if(carry!=0) {
               if(temp.data==9) {
                   temp.data=0;
               } 
               else {
                   temp.data+=1;
                   carry=0;
               }
            }
            temp=temp.next;
        }
        
        head=reverse(head); //agian reverse
        if(carry==1) {
            Node n=new Node(1);
            n.next=head;
            head=n;
        }
        return head;
    }
}

