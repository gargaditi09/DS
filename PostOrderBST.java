import java.util.*;
public class BinarySearchTree {
    class Node
    {
        int key;
        Node left;
        Node right;
        
        Node(int value)
        {
            key=value;
            left=null;
            right=null;
        }
    }
    
    Node root;
    
    BinarySearchTree()
    {
        root=null;
    }
    
    void insert(int key)
    {
        root=insertRecursive(root,key);
    }
    
    Node insertRecursive(Node root,int key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        else
        {
            if(key<root.key)
            {
                root.left=insertRecursive(root.left,key);
            }
            else if(key>root.key)
            {
                root.right=insertRecursive(root.right,key);
            }
            return root;
        }
    }
    
    void postOrder()
    {
        postOrderRecursive(root);
    }
    
    void postOrderRecursive(Node root)
    {
        if(root!=null)
        {
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.print(root.key+" ");
        }
    }
    public static void main(String args[]) {
        BinarySearchTree bst=new BinarySearchTree();
        
        bst.insert(23);
        bst.insert(18);
        bst.insert(12);
        bst.insert(20);
        bst.insert(44);
        bst.insert(35);
        bst.insert(52);
        
        System.out.print("PostOrder: ");
        bst.postOrder();
    }
}
