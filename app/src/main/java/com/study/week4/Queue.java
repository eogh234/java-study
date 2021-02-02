package com.study.week4;

public class Queue {
    public int front;
    public int rear;
    public int q[];

    public Queue() {
        front = 0;
        rear = 0;
        q = new int[100];
    }

    public void enqueue(int data){
        if (rear >= q.length){
            int temp[] = new int[q.length * 2];
            for (int i = front; i < q.length; i++){
                temp[i] = q[i];
            }
            q = temp;
        }
        rear++;
        q[rear - 1] = data;
    }

    public int dequeue(){
        if (rear - front < 1){
            System.out.println("Empty Queue");
            return 0;
        }
        int removed = q[front];
        front++;

        return removed;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
