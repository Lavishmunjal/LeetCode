import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestsum=100000;
        for(int k=0; k<nums.length-2; k++) {
            int i=k+1;
            int j= nums.length-1;
            while(i<j) {
                int sum = nums[k]+nums[i]+nums[j];
                if(Math.abs(target-sum)<Math.abs(target-closestsum)) {
                    closestsum=sum;
                }
                if(sum<target) i++;
                else j--;

            }


        }
        return closestsum;
    }
}
