import java.util.Scanner;
class Node{
int data;
Node left,right;

Node(int data)
{
this.data=data;
this.left=null;
this.right=null;
}
}

public class BinaryTree{

Node root;

Node BuildBinaryTree(Scanner Sc)
{
System.out.println("Enter the Element (-1 for null):");
int data=Sc.nextInt();

if(data==-1) return null;

Node newNode=new Node(data);
System.out.println("Enter the Left Child of "+data);
newNode.left=BuildBinaryTree(Sc);
System.out.println("Enter the Right child of "+data);
newNode.right=BuildBinaryTree(Sc);

return newNode;
}

public void Inorder(Node Current)
{

if(Current==null) return;

Inorder(Current.left);
System.out.print(Current.data+" ");
Inorder(Current.right);
}

public void Preorder(Node Current)
{

if(Current==null) return;

System.out.print(Current.data+" ");
Preorder(Current.left);
Preorder(Current.right);
}

public void Postorder(Node Current)
{

if(Current==null) return;

Postorder(Current.left);
Postorder(Current.right);
System.out.print(Current.data+" ");
}

public int levelOrder(Node Current)
    {
        if(Current==null)
        {
            return 0;
        }
        int lh=levelOrder(Current.left);
        int rh=levelOrder(Current.right);
        return Math.max(lh, rh)+1;
    }
public int countNode(Node Current)
    {
        if(Current==null)
        {
            return 0;
        }
        int lc=levelOrder(Current.left);
        int rc=levelOrder(Current.right);
        return lc+rc+1;
    }
public int sum(Node Current)
    {
        if(Current==null)
        {
            return 0;
        }
        int left=sum(Current.left);
        int right=sum(Current.right);
        return left+right+Current.data;
    }
    public boolean search(Node current, int key) {
    if (current == null) {
        return false;
    }
    if (current.data == key) {
        return true;
    }
    return search(current.left, key) || search(current.right, key);
}



public static void main(String[] args)
{
 Scanner Sc=new Scanner(System.in);
 BinaryTree tree=new BinaryTree();
tree.root=tree.BuildBinaryTree(Sc);
System.out.print("INORDER: ");
tree.Inorder(tree.root);
System.out.println();
System.out.print("PREORDER: ");
tree.Preorder(tree.root);
System.out.println();
System.out.print("POSTORDER: ");
tree.Postorder(tree.root);
System.out.println();
int height=tree.levelOrder(tree.root);
System.out.print("Height of the tree: "+height);
System.out.println();
System.out.print("Enter element to search: ");
int key = Sc.nextInt();
if (tree.search(tree.root, key)) {
System.out.println(key + " is found in the tree.");
} else {
   System.out.println(key + " is NOT found in the tree.");
}
System.out.println();
int Total_node=tree.countNode(tree.root);
System.out.print("Total Node: "+Total_node);
System.out.println();
int NodeSum=tree.sum(tree.root);
System.out.print("Total NodeSum: "+NodeSum);
}
}