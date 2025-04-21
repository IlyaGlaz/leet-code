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
    var curr = head
    var prev: ListNode? = null

    while (curr != null) {
        val nextTemp = curr.next
        curr.next = prev
        prev = curr
        curr = nextTemp
    }

    return prev
}

fun reverseListRec(head: ListNode?): ListNode? {
    var curr = head
    var prev: ListNode? = null

    if (curr == null) return prev

    val nextTemp = curr.next
    curr.next = prev
    prev = curr

    return reverseList(nextTemp)
}