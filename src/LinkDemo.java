import javafx.beans.property.ReadOnlyObjectProperty;

public class LinkDemo {
    public static void main(String args[]) {
//        Node root = new Node("火车头");
//        Node n1 = new Node("A车厢");
//        Node n2 = new Node("B车厢");
//        Node n3 = new Node("C车厢");
//        root.setNext(n1);
//        n1.setNext(n2);
//        n2.setNext(n3);
//        root.printLink();
//        pNode(n1);
        Link l = new Link("aaa");
        l.addNode("bbb");
        l.addNode("ccc");
        l.addNode("ddd");
        l.findNode("bbb");
        l.findNode("asdad");
        l.printLink();
        l.deleteNode("aaa");
        l.printLink();
        l.deleteNode("aaa");
        l.printLink();

    }

    public static void pNode(Node n) {
        System.out.println(n.getData() + "->");
        if (n.getNext() != null) {
            pNode(n.getNext());
        }
    }
}

class Node {
    private String data = null;
    private Node next = null;

    public Node(String data) {
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

    public void printLink() {
        System.out.println(this.getData() + "->");
        if (this.getNext() != null) {
            this.getNext().printLink();
        }
    }
}

class Link {
    private Node root = new Node();

    public Link() {
    }

    public Link(String data) {
        this.getRoot().setData(data);
    }

    public void addNode(String data) {
        Node temp = new Node(data);
        if (this.getRoot().getData() == null) {
            this.setRoot(temp);
        } else {
            this.getRoot().after(temp);
        }
    }

    public boolean findNode(String data) {
        if (this.getRoot().containNode(data)) {
            System.out.println("已找到！");
            return true;
        } else {
            System.out.println("未找到！");
            return false;
        }
    }

    public void deleteNode(String data) {
        if (this.findNode(data)){
            if (this.getRoot().getData().equals(data)){
                Node temp = this.getRoot();
                this.setRoot(this.getRoot().getNext());
                temp.setNext(null);
            } else{
                this.getRoot().getNext().delete(this.getRoot(),data);
            }
        }
    }

    public void printLink() {
        this.getRoot().print();
    }


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    class Node {
        private String data = null;
        private Node next = null;

        public Node() {
        }

        public Node(String data) {
            this.setData(data);
        }

        public void after(Node newNode) {
            if (this.getNext() == null) {
                this.setNext(newNode);
            } else {
                this.getNext().after(newNode);
            }
        }

        public boolean containNode(String data) {
            if (this.getData().equals(data)) {
                return true;
            } else {
                if (this.getNext() != null) {
                    return this.getNext().containNode(data);
                } else {
                    return false;
                }
            }
        }

        public void delete(Node previous, String data) {
            if (this.getData().equals(data)) {
                previous.setNext(this.getNext());
                this.setNext(null);
            } else {
                if (this.getNext()!=null){
                    this.getNext().delete(this, data);
                }
            }
        }

        public void print() {
            System.out.println(this.getData() + "->");
            if (this.getNext() != null) {
                this.getNext().print();
            } else {
                System.out.println("null\n");
            }
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
