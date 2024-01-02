/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var gcd = function(a, b) {
  return !b ? a : gcd(b, a % b);
}

var insertGreatestCommonDivisors = function(head) {
    const ans = head;
    let l = head; 
    while (l && l.next) {
        l.next = new ListNode(gcd(l.val, l.next.val), l.next);
        l = l.next.next;
    }
    return ans;
};