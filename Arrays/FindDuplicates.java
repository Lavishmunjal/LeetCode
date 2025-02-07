public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int n = nums.length;
        int num;
        for(int i=0; i<n ; i++){
            num = Math.abs(nums[i]);
            int idx = num-1;
            if(nums[idx]<0) {
                ls.add(num);
            } else {
                nums[idx] *=-1;
            }
        }
        return ls;
    
    }
}
