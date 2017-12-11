import javafx.beans.property.ReadOnlyObjectProperty;

public class LinkDemo {
    public static void main(String args[]){
        Node root = new Node("火车头");
        Node n1 = new Node("A车厢");
        Node n2 = new Node("B车厢");
        Node n3 = new Node("C车厢");
        root.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        root.printLink();
        pNode(n1);
    }

    public static void pNode(Node n){
        System.out.println(n.getData()+"->");
        if (n.getNext()!=null){
            pNode(n.getNext());
        }
    }
}

class Node{
    private String data=null;
    private Node next=null;

    public Node(String data){
        this.setData(data);
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void printLink(){
        System.out.println(this.getData()+"->");
        if (this.getNext()!=null){
            this.getNext().printLink();
        }
    }
}

