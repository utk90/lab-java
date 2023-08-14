package LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class CheckPalindromeLL {
    public ListNode reverseLL(ListNode head){
        ListNode curr = null;
        ListNode nxt = head;

        while(nxt!=null){
            ListNode temp = nxt.next;
            nxt.next = curr;
            curr = nxt;
            nxt = temp;
        }

        return curr;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode revLL = reverseLL(slow.next);
        ListNode temp = head;

        while(revLL!=null){
            if (revLL.val!=temp.val){
                return false;
            }
            revLL = revLL.next;
            temp = temp.next;
        }

        return true;
    }
}