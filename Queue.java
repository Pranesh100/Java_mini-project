class Queue{
    int max=5;
    int[] queue=new int[max];
    int front = -1, rear=-1;

    void enqueue(int value){
        if(rear==max-1){
            System.out.println("queue overflow");
        }else{
            if(front==-1) front=0;
            rear++;
            queue[rear]=value;
            System.out.println(value + " enqueued into queue");
        }
    }
    void dequeue(){
        if(front == -1 || front > rear){
            System.out.println("queue underflow");
        }else{
            System.out.println(queue[front] + " dequeued from queue");
            front++;
        }
    }
    void display(){
        if(front == -1 || front>rear){
            System.out.println("queue is empty");
        }else{
            for(int i=front; i<= rear; i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); 
        
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
    }
}