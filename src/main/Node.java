public class Node {

    String key;
    Integer value;
    Node next;

    public Node(String key, Integer value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public Boolean hasNext() {
        return (this.next != null);
    }

    public String getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
