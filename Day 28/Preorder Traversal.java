class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
       
        ArrayList<Integer> result = new ArrayList<>();
    if (root == null) {
        return result;
    }

   
    result.add(root.data);

    if (root.left != null) {
        result.addAll(preorder(root.left));
    }

   
    if (root.right != null) {
        result.addAll(preorder(root.right));
    }

    return result;
    }

}