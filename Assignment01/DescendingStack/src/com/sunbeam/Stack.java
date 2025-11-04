package com.sunbeam;

public class Stack {
    private int arr[];
    private int top;
    private final int SIZE;
    public Stack(int size) {
        SIZE = size;
        arr = new int[SIZE];
        top = SIZE;
    }

    public void push(int value) {
        if(top == 0)
            System.out.println("Stack is full");
        else {
            //a. reposition top
            top--;
            //b. add value at top index
            arr[top] = value;
        }
    }

    public int pop(){
        int temp = SIZE;
        if(top == SIZE)
            System.out.println("Stack is empty");
        else {
            temp = arr[top];
            //a. reposition top
            top ++;
        }
        return temp;
    }

    public int peek(){
        int temp = SIZE;
        if(top == SIZE)
            System.out.println("Stack is Empty");
        else {
            temp = arr[top];
        }
        return temp;
    }
}
