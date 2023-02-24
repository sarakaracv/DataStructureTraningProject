package Session_8;

public class CustomerNode {
    public int value;
    public CustomerNode leftChild;
    public CustomerNode rightChild;

    public String firstName;
    public String lastname;
    public String gmail;
    public String id;
    int key;
     public CustomerNode(int key){
         this.key=key;

     }

    public CustomerNode() {
    }

    public CustomerNode(String FirstName, String lastname, String gmail, String id) {
        this.firstName = FirstName;
        this.lastname = lastname;
        this.gmail = gmail;
        this.id = id;
    }
}
