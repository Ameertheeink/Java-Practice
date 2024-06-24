package linkedlist;

public class SamplenewList {
    Node head;
    public void insert(int data){
        Node box=new Node(data);
        if(head==null){
            head=box;
        }
        else{
            Node last=head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=box;
        }
    }

    public void display(){
        Node current=head;
        while (current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.print(" ");
    }

    public static void main(String[] args) {
        SamplenewList boxlist=new SamplenewList();
        boxlist.insert(20);
        boxlist.insert(30);
        boxlist.insert(40);
        boxlist.display();
    }
}
