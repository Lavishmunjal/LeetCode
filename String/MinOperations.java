//Source: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/

class Solution {
    public int[] MinOperations(String boxes) {
        int n= boxes.length();
        int result[] = new int[n];
        int cummValue = 0;
        int cummValueSum = 0;

        for(int i=0; i<n; i++){
            result[i] += cummValueSum;
            cummValue += boxes.charAt(i)=='0'?0:1;
            cummValueSum += cummValue;

        }
        cummValue =0;
        cummValueSum=0;
        for(int i=n-1; i>=0; i--){
            result[i] += cummValueSum;
            cummValue += boxes.charAt(i)=='0'?0:1;
            cummValueSum += cummValue;
            
        }
        return result;
    }
}

// Brute Force Approach

// class Solution {
//     public int[] minOperations(String boxes) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<boxes.length(); i++){
//             if(boxes.charAt(i)=='1'){
//                 set.add(i);
//             }
            

//         }
//         int n = boxes.length();
//         int[] answer = new int[n];

//         for(int i=0; i<n; i++){
//             for(int idx: set){
//                 answer[i] += Math.abs(i-idx);
//             }
//         }
//         return answer;
//     }
// }
