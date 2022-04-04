package office;

import java.util.List;

public class T24 {
}
//迭代递归都可以
class Solution24 {
    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        while (head!=null){
            ListNode temp = head.next;
            head.next=node;
            node = head;
            head = temp;
        }
        return node;
    }
}
