class stack {
    public int st[]= new int[10];
    public int top=-1;
    void push(int data){
        if(top==st.length){
            System.out.println("Stack is full");
            return ;
        }
        st[++top]=data;
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return ;
        }
        System.out.println("Stack top:"+st[top--]);
    }
    void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return ;
        }
        System.out.println("Peek of stack:"+st[top]);
        
    }
    public static void main(String[] args) {
        stack st=new stack();
        st.peek();
        st.push(4);
        st.pop();
        st.push(6);
        st.peek();
        
    }
}
