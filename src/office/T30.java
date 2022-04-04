package office;

import java.util.Stack;

public class T30 {
}
class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    /** initialize your data structure here. */
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        if (s1.isEmpty()){
            while(!s2.isEmpty())
                s1.add(s2.pop());
        }
        s1.add(x);
    }

    public void pop() {
        if (s1.isEmpty()){
            while(!s2.isEmpty())
                s1.add(s2.pop());
        }
        s1.pop();
    }

    public int top() {
        if (s1.isEmpty()){
            while(!s2.isEmpty())
                s1.add(s2.pop());
        }
        return s1.peek();
    }

    public int min() {
        int min=0;
        if (s1.isEmpty()){
            min = s2.peek();
            while (!s2.isEmpty()){
                if (min>s2.peek()) min = s2.peek();
                s1.add(s2.pop());
            }
        }else{
            min = s1.peek();
            while (!s1.isEmpty()){
                if (min>s1.peek()) min = s1.peek();
                s2.add(s1.pop());
            }
        }
        return min;
    }
}
class s2 extends MinStack{
    Stack<Integer> s1;
    int min=Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public s2() {
        s1 = new Stack<>();
    }

    public void push(int x) {
        s1.push(min);
        if (x<min) min = x;
        s1.push(x);
    }

    public void pop() {
        s1.pop();
        min = s1.peek();
        s1.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return min;
    }
}
