class tree {
    static int x=-1;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
   }
   static Node create(int node[]){
        x++;
        if(node[x]==-1)
            return null;
        Node newNode=new Node(node[x]);
        newNode.left=create(node);
        newNode.right=create(node);
        return newNode;
   } 
   static void traversal(Node root){
        if(root==null)
            return ;
        System.out.print(root.data+"-->");
        traversal(root.left);
        traversal(root.right);
   }
   public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,5,-1,-1,6,-1,-1};
        Node root=create(node);
        traversal(root);
   }
}
