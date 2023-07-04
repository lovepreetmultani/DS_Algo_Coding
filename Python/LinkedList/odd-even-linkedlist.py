# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
             return head
        
        oddptr=current=head
        evenptr=even=head.next
        count=1

        while current:
            if count > 2 and count%2==0:
                evenptr.next=current
                evenptr=evenptr.next
            elif count > 2 and count%2!=0:
                oddptr.next=current
                oddptr=oddptr.next
            current=current.next
            count+=1

        evenptr.next=None
        oddptr.next=even

        return head        