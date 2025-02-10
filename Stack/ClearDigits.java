import java.util.*;

class ClearDigits{
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            // int a = ch-'0';
            if(!st.isEmpty() && Character.isDigit(ch)) {
                st.pop();
            }else {
                st.push(ch);
            }
        }
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}