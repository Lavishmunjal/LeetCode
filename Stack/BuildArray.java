import java.util.ArrayList;
import java.util.List;

public class BuildArray {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int steam =1;
        int i=0;
        while(steam<=n && i<target.length){
            result.add("Push");
            if(steam == target[i]) {
                i++;
            }else {
                result.add("Pop");
            }
            steam++;
        }
        return result;
    }
}
