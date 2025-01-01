class Node{
    int data;
    Node next;
public Node(int data){
    this.data=data;
    this.next=null;
}
}
class Linkedlist{
    public static void main(String[] args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next.next=new Node(3);
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("null");
        }
        

    }