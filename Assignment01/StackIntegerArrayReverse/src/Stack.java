public class Stack {
    private int arr[];
    private int first;
    private final int SIZE;
    public Stack(int size){
        SIZE = size;
        arr = new int[SIZE];
        first = -1;
    }

    public void push(int value){
        if(isFull())
            System.out.println("Stack is full");
        else {
            //a. reposition top
            first++;
            //b. add value at top index
            for(int i = first; i > 0; i--)
                arr[i] = arr[i-1];
            arr[0] = value;
        }
    }

    public int pop(){
        int temp = arr[0];
        if (isEmpty())
            System.out.println("Stack is Empty");
        else{
            for (int i = 0; i < first; i++)
                arr[i] = arr[i+1];
            //a. reposition top
            first--;
        }
        return temp;
    }

    public int peek(){
        int temp = -1;
        if(isEmpty())
            System.out.println("Stack is empty");
        else{
            temp = arr[0];
        }
        return  temp;
    }

    public boolean isEmpty(){
        return first == -1;
    }

    public boolean isFull(){
        return first == SIZE - 1;
    }

    public void print() {
        if (isEmpty()){
            System.out.println("Stack is Empty");
        }
        else {
            for (int i = 0;i <= first; i++)
                System.out.printf("%d\t",arr[i]);
            System.out.println("\n");
        }
    }
}
