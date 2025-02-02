import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        // int n = asteriods.length;
        // int result[] = new int[];
        
        for(int ast: asteroids){
            while(!st.isEmpty() && st.peek()>0 && ast<0) {
                int sum= ast + st.peek();
                if(sum<0) {
                    st.pop();
                }else if(sum>0) {
                    ast=0;
                    // brea/k;
                }else {
                    st.pop();
                    ast=0;
                } 
            }
            if(ast!=0) {
                st.push(ast);
            }
        }
        int s= st.size();
        int result[] = new int[s];
        for(int i=s-1; i>=0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}
