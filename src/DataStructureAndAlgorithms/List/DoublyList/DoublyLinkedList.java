package DataStructureAndAlgorithms.List.DoublyList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.right=node2;
        node2.left=node1;node2.right=node3;
        node3.left=node2;node3.right=node4;
        node4.left=node3;node4.right=node5;
        node5.left=node4;
        //traverse via right reference
//        printDoublyLinkedList(node1);
        //traverse via left refrence
//        printDoublyLinkedListInReverse(node5);
        //insert at beginning
//        Node newNode = new Node(0);
//        Node head = insertAtBeginning(node1,newNode);
//        printDoublyLinkedList(head);
        // insert at last
//        Node newNode = new Node(6);
//        Node head = insertAtLast(node1,newNode);
//        printDoublyLinkedList(head);
//        Node newNode = new Node(100);
//        insertAtMiddle(node1,newNode);

        // insert at desired position
//        insertAtDiseredPosition(node1,500,5);
//        deleteAtDiseredPosition(node1,3);

    }

    public static void deleteAtDiseredPosition(Node head, int position){
        Node p = head;
        Node q = head;
        if(position == 1){
            head = head.right;
            printDoublyLinkedList(head);
            return;
        }
        int k = 1;
        while(null != p && k < position){
            k++;
            q = p;
            p = p.right;
        }
        if(null == p)
            System.out.println("position doesn't exist");
        else{
            q.right = p.right;
            p.left = q;
        }
        printDoublyLinkedList(head);
    }
    public static void insertAtDiseredPosition(Node head, int data, int position){
        Node newNode = new Node(data);
        Node p = head; Node q = head;
        int k = 1;
        if(position == 1){
            newNode.right = head;
            head.left = newNode;
            head = newNode;
            printDoublyLinkedList(head);
            return;
        }
        while(null != p && k < position){
            k++;
            q = p;
            p = p.right;
        }
        newNode.right = q.right;
        newNode.left = q;
        if(null != q.right){
            q.right.left = newNode;
        }
        q.right = newNode;
        printDoublyLinkedList(head);
    }



    private static Node insertAtMiddle(Node node, Node newNode) {
        Node head = node;
        while(node.right.data < newNode.data){
            node = node.right;
        }
        newNode.left = node;
        node.right= newNode;
        return head;
    }
    private static Node insertAtLast(Node node, Node newNode) {
        Node head = node;
        while(null != node.right){
            node = node.right;
        }
        newNode.left = node;
        node.right= newNode;
        return head;
    }

    private static Node insertAtBeginning(Node node, Node newNode) {
        newNode.right = node;
        node.left = newNode;
        return newNode;
    }

    private static void printDoublyLinkedListInReverse(Node node) {
        while(null != node){
            System.out.println(node.data);
            node = node.left;
        }
    }

    private static void printDoublyLinkedList(Node node1) {
        while(null != node1){
            System.out.println(node1.data);
            node1=node1.right;
        }
    }
}
