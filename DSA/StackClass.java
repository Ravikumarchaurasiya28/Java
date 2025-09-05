import java.util.*;

public class StackClass {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if(s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<> ();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(4, s);
        // Stack<Integer> s1 = new Stack<> ();
        // while(!s.empty()) {
        //     s1.push(s.pop());
        // }
        // s.push(4);
        // while(!s1.empty()) {
        //     s.push(s1.pop());
        // }
        while(!s.empty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}