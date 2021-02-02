package com.study.week4;

public class Stack {
    private int stack[];
    private int top;

    public Stack() {
        stack = null;
        top = 0;
    }

    public void push(int data){
        top++;
        int temp[] = new int[top];
        for (int i = 0; i < top - 1; i++){
            temp[i] = stack[i];
        }
        stack = temp;
        stack[top - 1] = data;
    }

    public int pop(){
        if (top < 1){
            System.out.println("Empty Stack");
            return 0;
        }
        int removedNum = stack[top - 1];
        top--;
        int temp[] = new int[top];
        for (int i = 0; i < top; i++){
            temp[i] = stack[i];
        }

        stack = temp;
        return removedNum;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(32);
        stack.push(41);
        stack.push(5);
        stack.push(500);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(2);
        stack.push(32);
        stack.push(41);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
