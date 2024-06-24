class SortLL {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode merge(ListNode temp1, ListNode temp2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        if (temp1 != null)
            temp.next = temp1;

        if (temp2 != null)
            temp.next = temp2;

        return dummy.next;
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // Splitting into Two Halves
        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null)
            prev.next = null;

        // Sort Each Half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // Merge l1 & l2
        return merge(l1, l2);
    }

    public static ListNode constructLL(int[] arr) {
        ListNode head = null;
        ListNode tail = null;

        for (int i : arr) {
            ListNode newNode = new ListNode(i);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 3, 4, 5, 6, 8 };
        ListNode head = constructLL(arr);
        head = sortList(head);
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("/");
    }
}
