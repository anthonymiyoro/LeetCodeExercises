def removeElements(self, head: ListNode, val: int) -> ListNode:
    # If linked list is empty
    if not head:
        return None
    
    # Access linked list with current_node
    while head is not None:
        if head.val == val:
            head = head.next
    
    current = head
    while current is not None:
        if current.next is not None and current.next.val == val:
            current.next = current.next.next
        else:
            current = current.next
    return head
                
                
def removeElements(self, head: ListNode, val: int) -> ListNode:
    # If linked list is empty
    if not head:
        return None
    
    # Access linked list with current_node
    previous_node = ListNode(None)
    previous_node.next_node = head
    ret = previous_node
    current_node = head
    
    while current_node is not None:
        if current_node.val == val:
            previous_node.next_node = current_node.next
            print ("Node Found!!  ", current_node.val)
            
        else:
            previous_node.next_node = current_node
            previous_node = current_node
            
        previous_node = previous_node.next
        
    return ret.next_node
            
        
        
