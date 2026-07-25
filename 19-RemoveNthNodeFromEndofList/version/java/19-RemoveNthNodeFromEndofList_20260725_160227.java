// Last updated: 7/25/2026, 4:02:27 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        if (head.next == null) return null;
14        
15        ListNode ptr = head;
16        ListNode temp = head;
17        
18        // Move ptr forward n times to create the gap
19        int i = 1;
20        while (i <= n) {
21            ptr = ptr.next; 
22            i++;
23        }
24        
25        // If ptr becomes null, we need to remove the head
26        if (ptr == null) return head.next;
27        
28        // Move both until ptr reaches the last node
29        while (ptr.next != null) {
30            ptr = ptr.next;
31            temp = temp.next;
32        } 
33        
34        // Skip the nth node from the end
35        if (temp.next != null) {
36            temp.next = temp.next.next;
37        }
38        
39        return head;
40    }
41}