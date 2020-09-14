class Tree
{
    void mirror(Node node)
    {
	    // Your code here
        if(node==null) return;
        Node l=null,r=null,temp=null;
        if(node.left!=null) 
            {l=node.left;  temp=node.left;}
        if(node.right!=null)
            {r=node.right; l=r;}
        else l=null;    
        if(temp!=null)
            r=temp;
        else r=null;    
        node.left=l; node.right=r;    
        mirror(node.left);
        mirror(node.right);
    }
}
