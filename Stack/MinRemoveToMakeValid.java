public class MinRemoveToMakeValid {
    public String minRemoveToMakeValid(String s) {
        int open = 0;
        StringBuilder temp = new StringBuilder();
        
        for(char c: s.toCharArray()) {
            if(c == '(') 
                open++;
            else if(c == ')') {
                if(open == 0)
                    continue;
                open--;
            }
            
            temp.append(c);
        }
        
        StringBuilder result = new StringBuilder();
        for(int i = temp.length() - 1; i >= 0; i--) {
            if(temp.charAt(i) == '(' && open-- > 0)
                continue;
            result.insert(0, temp.charAt(i));
        }
        
        return result.toString();
    }
}
