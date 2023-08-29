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
var middleNode = function(head) {
    let temp = head;
    let count = 0;
    while(temp.next) {
        temp = temp.next;
        count++;
    }
    
    count /= 2;
    
    while(count-- > 0) {
        head = head.next;
    }
    
    return head
};