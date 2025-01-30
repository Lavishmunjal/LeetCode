import java.util.*;
class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
        
    }
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.isEmpty() || st.peek()!=ch){
                st.push(ch);
            }else {
                st.pop();
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();

    }
}