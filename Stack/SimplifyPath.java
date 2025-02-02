import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] tokens = path.split("/");
        for(String token:tokens){
            if(token.isEmpty() || token.equals(".")) {
                continue;
            }else if(token.equals("..")) {
                if(!st.isEmpty()) {
                    st.pop();
                }
                
            }else {
                st.push(token);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String dir : st){
            sb.append("/");
            sb.append(dir);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
