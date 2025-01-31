import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {
        RemoveStars obj = new RemoveStars();
        String s = "ab**cd";
        System.out.println(obj.removeStars(s));
    }
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        int n=s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='*'){
                st.pop();
            }else {
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    
}
