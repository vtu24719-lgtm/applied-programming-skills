class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        ListNode secondHalfStart = reverseList(slow.next);

        // Step 3: Compare the first and second half
        ListNode firstHalfStart = head;
        ListNode secondHalfIter = secondHalfStart;
        boolean palindrome = true;
        while (palindrome && secondHalfIter != null) {
            if (firstHalfStart.val != secondHalfIter.val) {
                palindrome = false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfIter = secondHalfIter.next;
        }

        // Step 4: Optional - Restore the list
        slow.next = reverseList(secondHalfStart);

        return palindrome;
    }

    // Helper function to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
