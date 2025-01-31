import java.util.Stack;

public class ImplementQueueUsingStacks {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    int peekEle = -1;

    // public MyQueue() {
        
    // }
    
    public void push(int x) {
        if(input.isEmpty()) {
            // input.push();
            peekEle = x;
        }
        input.push(x);
    }
    
    public int pop() {
        if(output.isEmpty()){
            while(!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        int val = output.pop();
        return val;
    }
    
    public int peek() {
        if(output.isEmpty()) {
            return peekEle;
        }
        return output.peek();
    }
    
    public boolean empty() {
        if(input.isEmpty() && output.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
}