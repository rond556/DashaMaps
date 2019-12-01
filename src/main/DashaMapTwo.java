public class DashaMapTwo implements HashMapX {

    private Node[] hashArray = new Node[26];
    private Integer size = 0;


    @Override
    public void set(String key, Integer value) {
        String hash = HashMapFunctions.hashFunctionTwo(key);
        Integer hashKey = hash.charAt(0) - 'a';

        Node newNode = new Node(key, value);
        Node head = hashArray[hashKey];
        if(head == null){
            hashArray[hashKey] = newNode;
            size++;
        } else {
            while(head.next != null){
                head = head.next;
            }
        }
    }

    @Override
    public void delete(String key) {
        String hash = HashMapFunctions.hashFunctionTwo(key);
        Integer hashKey = hash.charAt(0) - 'a';

        Node head = hashArray[hashKey];
        if (head.getKey().equals(key)) {
            hashArray[hashKey] = head.next;
            size--;
        }
        while (head.next != null) {
            if (head.next.getKey().equals(key)) {
                head.next = head.next.next;
                break;
            }
            head = head.next;
            size--;
        }
    }

    @Override
    public Integer get(String key) {
        String hash = HashMapFunctions.hashFunctionTwo(key);
        Integer hashKey = hash.charAt(0) - 'a';
        Node node = hashArray[hashKey];
        while(node != null){
            if(node.getKey().equals(key)) {
                return node.getValue();
            }
            node = node.getNext();
        }
        return null;
    }

    @Override
    public Boolean isEmpty() {
        for (Node n : hashArray) {
            if (n != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Integer size() {
        return size;
    }

    @Override
    public Integer bucketSize(String key) {
        Integer bucket = 0;
        String hash =  HashMapFunctions.hashFunctionTwo(key);
        Integer hashKey =  hash.toCharArray()[0] - 'a';
        Node head = hashArray[hashKey];
        while (head != null){
            bucket ++;
            head = head.next;
        }
        return bucket;
    }
}
