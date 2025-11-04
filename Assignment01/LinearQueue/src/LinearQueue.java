public class LinearQueue {
    private int arr[];
    private int front;
    private int rear;
    private int size;
    public LinearQueue(int size){
        arr = new int[size];
        this.size = size;
        front = 0;
        rear = 0;
    }

    public void push(int data){
        if(isFull())
            System.out.println("Queue is full");
        else{
            //1. add data at rear index
            arr[rear] = data;
            //2. reposition rear
            rear++;
        }
    }

    public int pop() {
        int temp = 0;
        if (isEmpty())
            System.out.println("Queue is empty");
        else {
            temp = arr[front];
            //a. reposition front
            front++;
            //for proper memory utilization
            if (front == rear)
                front = rear = 0;
        }
        return temp;
    }

    public int peek(){
        int temp = 0;
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            //a. read data from frontend (front + 1)
            temp = arr[front];
        }
        return temp;
    }

    private boolean isFull() {
        return rear == size;
    }

    private boolean isEmpty() {
        return front == rear;
    }
}
