import java.util.*;


public class spiral {
  class Node{
	int data;
	Node left,right;
	public Node(int data){
		this.data=data;
		left=right=null;
	}
}

 Node root;
 spiral(){
	 root=null;
 }
 public void spirall(Node node)
 {
	 boolean a;
	 a=false;
	 int h= height(node);
	 int i;
	 for(i=1;i<=h;i++)
	 {
		 print(root,i,a);
		 a= !a;
	 }
 }
 int height(Node node) 
 { 
     if (node == null) 
         return 0; 
     else { 

        
         int lh = height(node.left); 
         int rh = height(node.right); 

       
         if (lh > rh) 
             return (lh + 1); 
         else
             return (rh + 1); 
     } 
 }
 public void print(Node root,int level,boolean a)
 {
	 if (root == null) 
         return; 
     if (level == 1) 
         System.out.print(root.data + " "); 
     else if (level > 1) { 
         if (a != false) { 
             print(root.left, level - 1, a); 
             print(root.right, level - 1, a); 
         } 
         else { 
             print(root.right, level - 1, a); 
             print(root.left, level - 1, a); 
         } 
     } 
 }
 void insert(int data)
	{
		root=insert(root,data);
	}
	Node insert(Node root,int data)
	{
		if(root==null)
		{
			root= new Node(data);
			return root;
		}
		else {
		 if (data < root.data) 
	            root.left = insert(root.left, data); 
	        else if (data > root.data) 
	            root.right = insert(root.right, data); 
			
			return root;}
		
	}


public void in(int data)
{
	root=insert(root,data);
}
public static void main(String args[])
{
	spiral s = new spiral();
	s.in(20);
	s.in(10);
	s.in(13);
	s.in(40);
	s.in(51);
    s.spirall(s.root);
}
}
