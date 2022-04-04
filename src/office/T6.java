package office;

import java.util.Stack;

public class T6 {
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

  }
class Solution6 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head!=null){
            stack.push(head.val);
            head=head.next;
        }
        int[] list = new int[stack.size()];
        for (int i = 0;i<stack.size();i++){
            list[i] = stack.pop();
        }
        return list;
    }
}
