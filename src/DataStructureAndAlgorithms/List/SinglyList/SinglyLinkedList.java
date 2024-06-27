package DataStructureAndAlgorithms.List.SinglyList;

public class SinglyLinkedList {
    public static void main(String[] args) {
        //create a fresh list
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        node1.next = node2;node2.next = node3;node3.next = node4;node4.next = node5;
        //traverse the list
//      printList(node1);

        //insert a new node at beginning of this list
//        Node beginningNode = new Node(5);
//        Node head = insertAtStart(node1, beginningNode);
//      printList(head);

        //insert a new node at last
//        Node lastNode = new Node(55);
//        head = insertAtLast(node1,lastNode);
//        printList(head);

        //insert a new node in middle
//        Node middleNode = new Node(35);
//        head = insertAtMiddle(node1,middleNode);
//        printList(head);

        //deleting a node from start
//        Node node = deleteFromStart(node1);
//        printList(node);
        //deletiong a node from last
//        Node nodeAfterDeleteLastNode = deleteFromEnd(node1);
//        printList(nodeAfterDeleteLastNode);
        //deleting a node from middle
//        Node nodeAfterDeleteFromMiddle = deleteFromMiddle(node1,30);
//        printList(nodeAfterDeleteFromMiddle);

        // insert at desired position
//        insertAtDiseredPosition(node1, 500, 6);
//        deleteAtDiseredPosition(node1,3);

    }

    private static void deleteAtDiseredPosition(Node head, int position) {
        Node p = head;
        Node q = head;
        if(position == 1){
            head = head.next;
            printList(head);
            return;
        }
        int k=1;
        while(null != p && k < position){
            k++;
            q=p;
            p = p.next;
        }
        if(null == p)
            System.out.println("position doesn't exist");
        else
            q.next = p.next;
        printList(head);
    }

    private static void insertAtDiseredPosition(Node head, int data, int position) {
        Node newNode = new Node(data);
        int k = 1;
        Node p=head;Node q = head;
        if (position == 1) {
            newNode.next = p;
            head = newNode;
            printList(head);
            return;
        }
        while(null != p && k < position){
            k++;
            q = p;
            p = p.next;
        }
        newNode.next = q.next;
        q.next = newNode;
        printList(head);
    }

    private static Node deleteFromMiddle(Node node1,int data) {
        Node head = node1;
        while(data != node1.next.data){
            node1 = node1.next;
        }
        node1.next = node1.next.next;
        return head;
    }

    private static Node deleteFromEnd(Node node1) {
        Node head = node1;
        while(null != node1.next.next){
            node1= node1.next;
        }
       node1.next = null;
        return head;
    }

    private static Node deleteFromStart(Node node1) {
        return node1.next;
    }

    private static Node insertAtMiddle(Node node, Node middleNode) {
        Node head = node;
        while(node.next.data < middleNode.data){
            node = node.next;
        }
        middleNode.next = node.next;
        node.next = middleNode;
        return head;
    }

    private static Node insertAtLast(Node node, Node lastNode) {
        Node head = node;
        while(null != node.next){
            node= node.next;
        }
        node.next = lastNode;
        return head;
    }

    private static Node insertAtStart(Node node, Node newNode) {
        newNode.next = node;
        node = newNode;
        return node;
    }

    private static void printList(Node node) {
        while(null != node){
            System.out.println(node.data);
            node= node.next;
        }
    }
}
