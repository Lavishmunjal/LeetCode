import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindOriginalArray {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n%2!=0) return new int[0];
        Arrays.sort(changed);

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int num:changed) {
            mpp.put(num, mpp.getOrDefault(num, 0)+1);
        }
        List<Integer> result = new ArrayList<>();
        for(int num:changed){
            int twice = 2*num;
            if(mpp.get(num)==0) continue;
            if (!mpp.containsKey(twice) || mpp.get(twice) == 0) {
                return new int[0]; // Invalid case
            }
            result.add(num);
            mpp.put(num, mpp.get(num) - 1);
            mpp.put(twice, mpp .get(twice) - 1);
        }
            int[] originalArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            originalArray[i] = result.get(i);
        }
        
        return originalArray;
        
    }
}
