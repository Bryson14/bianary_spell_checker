public class BinarySearchTree {

    public class TreeNode extends comparable{
        public value E;
        public TreeNode right;
        public TreeNode left;

        public TreeNode(E value) {
            this.value = value;
        }
    }

    boolean insert(E value) {
        if(root == null) {
            root = new TreeNode(value);
        }
        else {
            TreeNode parent = null;
            TreeNode node = root;

            while(node != null){
                parent = node;
                if(node.value.compareTo(value) < 0){
                    node = node.right;
                }
                else{
                    node = node.left;
                }
            }
            TreeNode newNode = TreeNode(value;
            if parent.value.compareTo(value) < 0) {
                parent.right = newNode;
            } else if (parent.value.comareTo(value) > 0){
                parent.left = newNode;
            } else {continue} //rejects duplicates
        }
    }
    boolean remove(E value) {

    }
    boolean search(E value){

    }
    void display(String message){

    }
    int numberNodes(){

    }
    int numberLeafNodes(){

    }
    int height(){

    }
}