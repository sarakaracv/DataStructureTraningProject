package session_3;

public class Node {
    public int key;
    public Node right;
    public Node left;
    String name;
    String lastName;
    String email;
    String phoneNumber;
    Node next;

    public Node(int key) {
        this.key = key;
    }

    public Node(String name, String lastName, String email, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
