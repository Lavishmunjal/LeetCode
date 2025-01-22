import java.util.ArrayList;
import java.util.List;

class Permutaion {
    private List<List<Integer>> result = new ArrayList<>();
    private int n;

    private void solve(int idx, List<Integer> nums) {
        if (idx == n) {
            result.add(new ArrayList<>(nums));
            return;
        }

        for (int i = idx; i < n; i++) {
            // Swap elements
            swap(nums, i, idx);

            // Recurse for the next index
            solve(idx + 1, nums);

            // Backtrack
            swap(nums, i, idx);
        }
    }

    private void swap(List<Integer> nums, int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }

    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }
        solve(0, numsList);
        return result;
    }
}
