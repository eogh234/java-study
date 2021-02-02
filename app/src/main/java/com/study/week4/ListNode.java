package com.study.week4;

public class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode() {
        this.data = 0;
        this.next = null;
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        if (head.next == null){
            head.next = nodeToAdd;
            nodeToAdd.next = null;
            return head;
        }
        for (ListNode node = head; node.next != null; node = node.next) {
            if (position <= 0) {
                nodeToAdd.next = node.next;
                node.next = nodeToAdd;
                break;
            } else {
                position--;
            }
        }

        return head;
    }

    public ListNode remove(ListNode head, int positionToRemove) {
        ListNode removedNode = new ListNode();
        ListNode prevNode = new ListNode();
        if (positionToRemove < 0){
            System.out.println("인덱스는 0이상\n");
            return null;
        }
        prevNode = head;
        removedNode = head.next;
        while (positionToRemove-- > 0){
            prevNode = removedNode;
            removedNode = removedNode.next;
        }

        prevNode.next = removedNode.next;

        return removedNode;
    }

    public boolean contains(ListNode head, ListNode nodeToCheck) {
        for (ListNode node = head; node != null; node = node.next) {
            if (node.data == nodeToCheck.data){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode linkedList = new ListNode();
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        linkedList.add(linkedList, node1, 0);
        linkedList.add(linkedList, node2, 0);
        linkedList.add(linkedList, node3, 0);

        for (ListNode node = linkedList.next; node != null; node = node.next){
            System.out.println(node.data);
        }

        System.out.printf("------------------------------\n");

        linkedList.remove(linkedList, 0);
        for (ListNode node = linkedList.next; node != null; node = node.next){
            System.out.println(node.data);
        }

        System.out.println(linkedList.contains(linkedList, new ListNode(10)));
    }
}
