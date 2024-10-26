class count_node {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    static int idx=-1;
    static Node create(int node[]){
        idx++;
        if(node[idx]==-1){
            return null;
        }
        Node newNode=new Node(node[idx]);
        newNode.left=create(node);
        newNode.right=create(node);
        return newNode;
    }
    static int count(Node root){
        if(root==null)
            return 0;
        int left=count(root.left);
        int right=count(root.right);
        return left+right+1;
    }
    static void traversal(Node root){
        if(root==null)
            return ;
        System.out.print(root.data+"-->");
        traversal(root.left);
        traversal(root.right);
   }
    public static void main(String[] args) {
        int arr[]={1,2,3,-1,-1,4,-1,-1,-1};
        Node root=create(arr);
        traversal(root);
        System.out.println("null");
        System.out.println("Total num of nodes:"+count(root));
    }
}
