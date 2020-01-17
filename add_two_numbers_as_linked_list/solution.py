# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        len1, len2 = self.getLength(l1), self.getLength(l2)
        l1 = self.addLeadingZeros(len2-len1, l1)
        l2 = self.addLeadingZeros(len1-len2, l2)
        c, ans = self.combineList(l1, l2)
        if c>0:
            l3 = ListNode(c)
            l3.next = ans
            ans = l3
        return ans

    # get lenght of a linked list
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

    
    def combineList(self, l1, l2):
        if (not l1 and not l2):
            return (0, None)
        c, new = self.combineList(l1.next, l2.next)
        s = l1.val+l2.val+c
        ans = ListNode(s % 10)
        ans.next = new
        return (s/10, ans)
        

mySolution = Solution()
mySolution.addTwoNumbers([2,4,3], [5,6,4], c = 0)
