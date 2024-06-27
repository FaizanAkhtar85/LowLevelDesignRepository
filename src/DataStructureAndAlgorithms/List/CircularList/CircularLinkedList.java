package DataStructureAndAlgorithms.List.CircularList;

public class CircularLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(100);
        Node node2 = new Node(200);
        Node node3 = new Node(300);
        Node node4 = new Node(400);
        Node node5 = new Node(500);
        node1.next =node2;
        node2.next= node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node1;
        //traverse circular list
//        printCircularLinkedList(node1);
        //count number of nodes in a circular ll
//        countNumberOfNodes(node1);
        //inserting a node at end
//        Node head = insertAtEnd(node1, 600);
//        printCircularLinkedList(head);
        // inserting a node at front
//        Node head = insertAtFront(node1,50);
//        printCircularLinkedList(head);
        //delete from end
//        Node head = deleteFromEnd(node1);
//        printCircularLinkedList(head);
        // delete from start
        Node head = deleteFromStart(node1);
        printCircularLinkedList(head);
    }

    private static Node deleteFromStart(Node head) {
        Node current = head;
        Node previous = head;
        if(null == head){
            return head;
        }
        while(current.next != head){
            current = current.next;
        }
        current.next = head.next;
        head = head.next;
        return head;
    }

    private static Node deleteFromEnd(Node head) {
        Node current = head;
        Node previous = head;
        if(null == head){
            return head;
        }
        while(current.next != head){
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
        return head;
    }

    private static Node insertAtFront(Node head, int data) {
        Node current = head;
        Node newNode = new Node(data);
        while (current.next != head){
            current = current.next;
        }
        if(null == head)
            head = newNode;
        else{
            newNode.next = head;
            current.next = newNode;
            head = newNode;
        }
        return head;
    }

    private static Node insertAtEnd(Node head, int data) {
        Node current = head;
        Node newNode = new Node(data);
        while(current.next != head){
            current = current.next;
        }
        if(null == head)
            head = newNode;
        else{
            newNode.next = head;
            current.next = newNode;
        }
        return head;
    }

    private static void countNumberOfNodes(Node head) {
        int count = 0;
        if(null == head)
            System.out.println("Number of nodes are "+count);
        Node current = head;
        do{
            count++;
            current = current.next;
        }while (current!=head);
        System.out.println("Number of nodes are "+count);
    }

    private static void printCircularLinkedList(Node head) {
        Node current = head;
        do{
            System.out.println(current.data);
            current = current.next;
        }
        while(current!=head);
    }
}
