import java.util.*;

public class MinStack155 {
    // used List which takes longer (cuz of implementing all manually)
    // used Stack which is more efficient but make sure maintaining the 2nd min on the top second
    Stack<Integer> res = new Stack<>();
    int min;
    public MinStack155() {
        res = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (val <= min) {
            min = val;
            res.push(min);
        }
        res.push(val);
    }

    public void pop() {
        if (res.isEmpty()) return;
        if (res.pop() == min) {
            min = res.pop();
        }
    }

    public int top() {
        if (res.isEmpty()) return -1;
        return res.peek();
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack155 minStack = new MinStack155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin(); // return -2
    }
}
