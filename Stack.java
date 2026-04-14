class Stack{
    int max=5;
    int[] stack=new int[max];
    int top=-1;

    void push(int value){
        if(top == max-1){
            System.out.println("stack overflow");
        }else{
            top++;
            stack[top]=value;
            System.out.println(value + "pushed into stack");
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("stack underflow");
        }else{
            System.out.println(stack[top] + "popped from stack");
            top--;
        }
    }
    void display(){
        if(top == -1){
            System.out.println("stack is empty");
        }else{
            for(int i=top; i>=0; i--){
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60); 
        s.display();
        s.pop();
        s.pop();
        s.display();
    }
}
