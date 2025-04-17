package linkedlist

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode?
    var current = head

    while (current != null) {
        var nxt = head!!.next
        prev = head!!.next
        current = prev
        nxt = current
    }

    return head
}