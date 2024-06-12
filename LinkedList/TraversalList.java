public class TraversalList {
   public static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
           }
        public static void main(String[] args) 
        {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
            printList1(head);
            printList(head);
        }
        // itrative approach
        public static void printList1(Node head) {
            Node curr = head;
            while(curr !=null){
                System.out.print(curr.data +" ");
                curr = curr.next;
            }
            System.out.print("\n");
        }
         /// T.C. O(n)
         
        // recursive approach
        public static void printList(Node head){
            if(head == null)
                return ;
            System.out.print(head.data + " ");
            printList(head.next);
        }
    }
     /// T.C. O(n)
    

