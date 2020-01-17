import org.apache.log4j.Logger;

public class TreeSet {
    private static final Logger LOGGER = Logger.getLogger(TreeSet.class);

    public Node insert(Node node, int val) {
        if(node == null) {
            return createNewNode(val);
        }
        if (val < node.getData()){
            node.setLeft(insert(node.getLeft(),val));
        } else if(val > node.getData()){
            node.setRight(insert(node.getRight(),val));
        }
        return node;
    }

    public Node delete(Node node, int value){
        if(node == null) {
            return null;
        }
        if(value < node.getData()){
            node.setLeft(delete(node.getLeft(), value));
        }else if(value > node.getData()){
            node.setRight(delete(node.getRight(), value));
        }else {
            if (node.getLeft() == null || node.getRight() == null){
                Node temp = null;
                temp = node.getLeft() == null ? node.getLeft() : node.getRight();
                if (temp == null){
                    return null;
                } else {
                    return temp;
                }
            } else {
                Node successor = getSuccessor(node);
                node.setData(successor.getData());
                node.setRight(delete(node.getRight(), successor.getData()));
                return node;
            }
        }
        return node;
    }

    public Node getSuccessor(Node node) {
        if(node == null) {
            return null;
        }

        Node temp = node.getRight();

        while(temp.getLeft() != null) {
            temp = temp.getLeft();
        }

        return temp;
    }

    public void inOrder(Node node){
        if(node == null){return ;}
        inOrder(node.getLeft());
        LOGGER.info(node.getData());
        inOrder(node.getRight());
    }

    public void reverse(Node node){
        if(node == null){return ;}
        reverse(node.getRight());
        LOGGER.info(node.getData());
        reverse(node.getLeft());

    }


    public Node createNewNode(int val){
        Node node = new Node();
        node.setData(val);
        node.setLeft(null);
        node.setRight(null);
        return node;
    }

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        Node root = null;
        root = ts.insert(root, 8);
        root = ts.insert(root, 3);
        root = ts.insert(root, 6);
        root = ts.insert(root, 10);
        root = ts.insert(root, 4);
        root = ts.insert(root, 7);
        root = ts.insert(root, 1);
        root = ts.insert(root, 14);
        root = ts.insert(root, 13);

        //ts.delete(root, 3);
        //ts.inOrder(root);
        ts.reverse(root);
    }
}
