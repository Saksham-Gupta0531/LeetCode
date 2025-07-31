# Last updated: 7/31/2025, 12:28:34 PM
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        s=""
        while(head!=None):
            s=s+str(head.val)
            head=head.next
        s=int(s,2)
        return s
        