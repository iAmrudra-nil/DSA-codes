import java.util.*;
class LL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    static void insert(int data){
        if(head==null){
            head=new Node(data);
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(data);
        }
    }
    static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    static void del(){
        if(head==null){
            System.out.println("No item in linked list");
        }
        else{
            System.out.println("del val:"+head.data);
            head= head.next;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice (insert=1,del=3,print=2,exit=4):");
            int n=sc.nextInt();
            switch (n) {
                case 1:System.out.println("give data:");
                        int data=sc.nextInt();
                        insert(data);
                        break;
                case 2:print();
                        break;
                
                case 3: del();
                        break;
                case 4: System.exit(1);
            }
        }
    }
}
