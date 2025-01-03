// Source: https://leetcode.com/problems/ways-to-split-array-into-three-subarrays/

class NoofWaysTosplitArray {
    public static void main(String[] args) {
        NoofWaysTosplitArray obj = new NoofWaysTosplitArray();
        int[] nums = {1, 2, 2, 2, 5, 0};
        System.out.println(obj.waysToSplit(nums));
    }
    public int waysToSplit(int[] nums) {
        // Initialize variables
        long totalsum = 0;   // Total sum of all elements in the array
        long leftsum = 0;     // Sum of elements in the left partition
        long rightsum;    // Sum of elements in the right partition
        int n = nums.length;  // Length of the input array
        int count = 0;        // Counter for valid splits

        // Calculate the total sum of the array
        for (int i = 0; i < n; i++) {
            totalsum += nums[i];
        }

        // Iterate through the array and calculate left and right sums
        for (int i = 0; i < n - 1; i++) {
            leftsum += nums[i];             // Add current element to the left sum
            rightsum = totalsum - leftsum;  // Subtract left sum from total to get right sum

            // Check if the left sum is greater than or equal to the right sum
            if (leftsum >= rightsum) {
                count++;  // Increment count if the condition is satisfied
            }
        }

        // Return the number of valid splits
        return count;
    }
}
