//// Instertion in Singly Linked List at beginning

public class Insertion {
    public static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
           }
            //// insert at begin
           public static Node insertBegin(Node head,int x) {
              Node temp = new Node(x);
              temp.next = head;
              return temp;   
           }   


          ///// insert at given position

          public static Node insertPostion(Node head,int pos, int x) {
            Node temp = new Node(x);
           if(pos == 1){
            temp.next = head;
            return temp;
           }
           Node curr = head;
           for(int i=1;i<=pos-2 && curr != null;i++)
            curr = curr.next;
            if(curr == null)
            return head;
            temp.next = curr.next;
            curr.next = temp;
            return head;
           }
               
           

              //// inset at last/end 
           public static Node insertEnd(Node head,int x) {
            Node temp = new Node(x);
             if(head == null)
             return temp;
             Node curr = head;
             while(curr.next != null)
                curr = curr.next;
                  curr.next = temp;
                  return head;
             } 
            

       public static void main(String[] args) {
        Node head = null;
        head = insertBegin(head,10);
        head = insertBegin(head,20);
        head = insertBegin(head,30);
        head = insertBegin(head,40);
        head = insertEnd(head,10);
        head = insertEnd(head,20);
        head = insertEnd(head,30);
        
        // System.out.println(insertBegin(head, 5)  );
        // System.out.println(insertPostion(head, 3, 8));
        // System.out.println(insertEnd(head, 5));



       }

    }
