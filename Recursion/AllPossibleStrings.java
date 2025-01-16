import java.util.*;
class AllPossibleStrings
{
    public static void main(String[] args) {
        AllPossibleStrings obj = new AllPossibleStrings();
        String s = "abc";
        System.out.println(obj.AllPossibleStrings(s));
    }
    private static List<String> result = new ArrayList<>();
    public static List<String> AllPossibleStrings(String s)
    {
        StringBuilder curr = new StringBuilder();

        solve(curr, s, 0);

        Collections.sort(result);

        return result;
    }
    private static void solve(StringBuilder curr, String s, int idx) {
        if (idx == s.length()) {
            if (curr.length() > 0) {
                result.add(curr.toString());
            }
            return;
        }

        curr.append(s.charAt(idx));
        solve(curr, s, idx + 1);
        curr.deleteCharAt(curr.length() - 1);
        solve(curr, s, idx + 1);
    }
    
}