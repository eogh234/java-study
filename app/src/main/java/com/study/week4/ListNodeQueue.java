package com.study.week4;

public class ListNodeQueue {
    public ListNode head;
    public ListNodeQueue() {
        head = new ListNode();
    }

    public void enqueue(int data){
        ListNode node = new ListNode(data);
        for (ListNode n = head; n != null; n = n.next){
            if (n.next == null){
                node.next = n.next;
                n.next = node;
                break;
            }
        }
    }

    public int dequeue(){
        if (head.next == null){
            System.out.println("Empty Queue");
            return 0;
        }
        ListNode removed;
        removed = head.next;
        head.next = head.next.next;
        removed.next = null;

        return removed.data;
    }

    public static void main(String[] args) {
        ListNodeQueue queue = new ListNodeQueue();

        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(34);
        queue.enqueue(3636);
        queue.enqueue(6624);
        queue.enqueue(47111);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
