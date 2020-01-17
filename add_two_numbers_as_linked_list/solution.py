# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        len1, len2 = self.getLength(l1), self.getLength(l2)
        l1 = self.addLeadingZeros(len2-len1, l1)
        l2 = self.addLeadingZeros(len1-len2, l2)
        carry_over, ans = self.combineList(l1, l2)
        
        if carry_over >= 1:
            l3 = ListNode(carry_over)
            l3.next = ans
            ans = l3
        return ans

    # get length of a linked list
    def getLength(self, node):
        l = 0
        while node:
            l += 1
            node = node.next
        return l

    # add the leading 0s to the linked list
    def addLeadingZeros(self, n, node):
        for i in range(n):
            new = ListNode(0)
            new.next = node
            node = new
        return node

    # add individual values in both lists, if there is a carry over, add it as well 
    def combineList(self, l1, l2):
        if (not l1 and not l2):
            return (0, None)
        carry_over, new = self.combineList(l1.next, l2.next)
        s = l1.val+l2.val+carry_over
        
    # append added value and make new node?
        ans = ListNode(int(s % 10))
        ans.next = new
        
        return (s/10, ans)
