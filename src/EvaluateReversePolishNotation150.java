import java.util.Stack;

public class EvaluateReversePolishNotation150 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a,b;
        for (String s : tokens) {
            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (s.equals("/")) {
                b = stack.pop();
                a = stack.pop();
                stack.push(a / b);
            } else if (s.equals("-")) {
                b = stack.pop();
                a = stack.pop();
                stack.push(a - b);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String tokens[] = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
}
