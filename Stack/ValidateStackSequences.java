import java.util.Stack;

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st  = new Stack<>();
        int i=0, j=0;
        int m = pushed.length;
        while(i<m && j<m){
            st.push(pushed[i]);
            while(!st.isEmpty() && j<m && st.peek()== popped[j]){
                st.pop();
                j++;
            }
            i++;
        }
        return st.isEmpty();
    }
}
