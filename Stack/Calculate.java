import java.util.Stack;
class Calculate {

    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int number=0;
        int result=0;
        int n =s.length();
        int sign =1;
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                number = number*10 + (ch -'0');

            }else if(ch == '+'){
                //number bn chuka h
                result += (number*sign);
                number=0;
                sign=1;
            }else if(ch== '-') {
                result += (number*sign);
                number=0;
                sign=-1;

            }else if(ch=='('){
                st.push(result);
                st.push(sign);
                result =0;
                number=0;
                sign=1;

            }else if(ch==')'){
                result += (number*sign);
                number=0;

                int stack_sign = st.pop();
                int last_result = st.pop();
                result *= stack_sign;
                result += last_result;
            }
        }
        result += (number*sign);
        return result;
    }
}