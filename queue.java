 class queue {
    public int[]qu=new int[20];
    public int f=-1,r=-1;
    void add(int data){
        if(f==qu.length){
            System.out.println("Queue is full");
            return ;
        }
        if(r==-1){
            f=r=0;
        }
        qu[f++]=data;

    } 
    void del(){
        if(r==f){
            System.out.println("Queue is empty");
            f=r=-1;
            return ;
        }
        System.out.println("del val:"+qu[r++]);
    }
    int peek(){
        return qu[r];
    }
    void display(){
        if(r==-1)
            return;
        for(int i=r;i<f;i++){
            System.out.println(qu[i]);
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(34);
        q.add(45);
        q.add(23);
        System.out.println("Peek of q:"+q.peek());
        q.display();
        q.del();
        System.out.println("Peek of q:"+q.peek());
        q.display();
        q.del();
        q.del();
        q.del();
        q.display();
    }    
}
