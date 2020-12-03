class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    Random rand = null;
    ListNode head = null;
    public Solution(ListNode head) {
        this.head = head;
        this.rand = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int res = -1;
        ListNode tmp = head;
        for(int i = 1; tmp != null; i++) {
            if(rand.nextInt(i) == i - 1) res = tmp.val;
            tmp = tmp.next;
        }
        return res;
    }
}