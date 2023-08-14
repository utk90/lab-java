package LinkedList;

class ListNode {
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

class MergeTwoSortedLL {
    public void insertBetween(ListNode prv, ListNode nxt, ListNode curr) {
        prv.next = curr;
        curr.next = nxt;
    }

    public ListNode solve(ListNode list1, ListNode list2) {
        ListNode prv = list1;
        ListNode nxt = list1.next;
        ListNode curr = list2;

        while (curr != null && nxt != null) {
            ListNode tempCurrNxt = curr.next;
            if (curr.val >= prv.val && curr.val <= nxt.val) {
                insertBetween(prv, nxt, curr);
                prv = prv.next;
                curr = tempCurrNxt;
            }
            // case (curr.val>nxt.val)
            else {
                prv = prv.next;
                nxt = nxt.next;
            }
        }

        if (curr != null) {
            prv.next = curr;
        }

        return list1;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val <= list2.val) {
            return solve(list1, list2);
        } else {
            return solve(list2, list1);
        }
    }
}