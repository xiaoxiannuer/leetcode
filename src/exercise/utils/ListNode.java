package exercise.utils;

public class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode append(ListNode node) {
        ListNode currentNode = this;
        while (true) {
            ListNode nextNode = currentNode.next;
            if (nextNode == null) {
                break;
            } else {
                currentNode = nextNode;
            }
        }
        currentNode.next = node;
        return this;
    }

    public void show() {
        ListNode currentNode = this;
        while (true) {
            System.out.print(currentNode.data + "");
            currentNode = currentNode.next;
            if (currentNode == null) {
                break;
            }
        }
        System.out.println();
    }


}
