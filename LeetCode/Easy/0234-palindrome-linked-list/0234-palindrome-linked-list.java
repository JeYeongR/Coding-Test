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
class Solution {
    public boolean isPalindrome(ListNode head) {
        int count = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (i < count / 2) {
                sb1.append(head.val);
            }
            if (count % 2 == 0) {
                if (i >= count / 2) sb2.append(head.val);
            } else {
                if (i > count / 2) sb2.append(head.val);
            }

            head = head.next;
        }
        sb1.reverse();

        return sb1.toString().equals(sb2.toString());
    }
}