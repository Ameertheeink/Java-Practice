package linkedlist;

public class SingleLinkedList {

    Node head;

    public void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }else{
            Node last=head;
            while(last.next !=null){
                last=last.next;

            }
            last.next=newnode;
        }

    }

    public void printlist(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.print(" ");
    }

    public static void main(String[] args) {
        SingleLinkedList sl=new SingleLinkedList();
        sl.insert(0);
        sl.insert(10);
        sl.insert(8);
        sl.insert(2);


        sl.printlist();
    }
}
