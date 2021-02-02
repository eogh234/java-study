package com.study.week4;

public class ListNodeStack {
    public ListNode head;

    public ListNodeStack() {
        this.head = new ListNode();
    }

    public void push(int data){
        ListNode node = new ListNode(data);
        node.next = head.next;
        head.next = node;
    }

    public int pop(){
        if (head.next == null){
            System.out.println("Empty Stack");
            return 0;
        }
        ListNode removedNode = head.next;
        int removed = removedNode.data;
        head.next = removedNode.next;
        removedNode.next = null;
        return removed;
    }

    public static void main(String[] args) {
        ListNodeStack stack = new ListNodeStack();
        stack.push(5);
        stack.push(52);
        stack.push(551);
        stack.push(333);
        stack.push(12);
        stack.push(66);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(1222);
        stack.push(6146);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
