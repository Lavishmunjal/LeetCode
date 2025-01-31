import java.util.Stack;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                int result = Operate(a, b, token);
                st.push(result);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop(); // Pop instead of peek to get the final result
    }

    public int Operate(int a, int b, String token) {
        if (token.equals("+")) {
            return a + b;
        }
        if (token.equals("-")) {
            return a - b;
        }
        if (token.equals("*")) {
            return a * b;
        }
        if (token.equals("/")) {
            return a / b;
        }
        return -1; // This should never happen if the input is valid
    }
    
}
