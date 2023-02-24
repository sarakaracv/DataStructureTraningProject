package Session_8;

import session_3.Node;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookTree {
    CustomerNode root;

    public PhoneBookTree() {
        this.root=null;
    }

    void insert(CustomerNode newNode) {
        if (root==null){
            root=newNode;
            return;
        }else {
            CustomerNode current=root;
            while(true){
                if (newNode.firstName.compareToIgnoreCase(current.firstName)<0){
                    if (current.leftChild==null) {
                        current.leftChild=newNode;
                        break;
                    }
                 current=current.leftChild;
                }
                else {
                    if (current.rightChild==null){
                        current.rightChild=newNode;
                        break;
                    }
                    current=current.rightChild;
                }
            }
        }
    }

      void printNamesInAscOrder(CustomerNode root){
            if (root==null) return;
            if (root!=null) {
                printNamesInAscOrder(root.leftChild);
                System.out.println(root.firstName+", ");
                printNamesInAscOrder(root.rightChild);
            }
        }

    List<String> firstNamesList(CustomerNode root){ // This is an In Order Traversal Iteratively
    List<String> firstname= new ArrayList<String>();
    if (root!=null){
        firstname.addAll(firstNamesList(root.leftChild));
        String[] name= root.firstName.split(" ");
        firstname.add(name[0]);
        firstname.addAll(firstNamesList(root.rightChild));
    }
    return firstname;
    }

    // return size or number of entries in the phonebook


    public Node search(Node root, int key){

        // Base Cases: root is null or key is present at root
        if (root==null || root.key==key)
            return root;

        // Key is greater than root's key
        if (root.key < key)
            return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }
}

