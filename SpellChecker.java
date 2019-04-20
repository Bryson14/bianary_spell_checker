public class SpellChecker{
    TreeNode root;

    public boolean find(String value) {
        boolean found = false;
        TreeNode node = root;

        while(!found && node != null) {
            if (node.value.equals(value)) {
                found = true
            }
            else if (node.value.compareTo(value) < 0) {
                node = node.right;
            }
            else {
                node = node.left;
            }
        }

        return found;
    }
}