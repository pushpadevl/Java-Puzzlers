public class LinkedList<E> {
    private Node head =null;

    //private class Node<E>{ //non static because it is dependent on E type (instance specific)
    private class Node{  
        E value;
        //Node<E> next;
        Node next;

        Node (E value){
            this.value = value;
            this.next = head;
            head = this;
        }
    }

    public void add(E e){
        //new Node<E>(e);
        new Node(e);
    }

    public void dump(){
        //for(Node<E> n = head; n!=null; n=n.next)
        for(Node n = head; n!=null; n=n.next)
            System.out.print(n.value+" ");
    }

    public static void main(String []args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("world");
        list.add("hello");
        list.dump();
    }
}


/* replacing Node<E> with Node solves the problem
*/