import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String t : tokens) {
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();

                if (t.equals("+")) {
                    stack.push(b + a);
                } else if (t.equals("-")) {
                    stack.push(b - a);
                } else if (t.equals("*")) {
                    stack.push(b * a);
                } else {
                    stack.push(b / a);  
                }
            } else {
                int val = Integer.parseInt(t);
                stack.push(val);
            }
        }
        
        return stack.pop();
    }
}
