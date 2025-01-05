// Source: LeetCode:https://leetcode.com/problems/shifting-letters-ii/description

public class ShiftingLetters {
    public static void main(String[] args) {
        ShiftingLetters obj = new ShiftingLetters();
        String s = "abc";
        int[][] shifts = {{0,1,0},{1,2,1},{0,2,1}};
        System.out.println(obj.shiftingLetters(s, shifts));
    }
    
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] arr = new int[n];
        for(int[] shift:shifts){
            if(shift[2]==1){
                arr[shift[0]]++;
                if(shift[1]+1<n){
                    arr[shift[1]+1]--;
                }
                
            }else {
                arr[shift[0]]--;
                if(shift[1]+1 <n){
                    arr[shift[1]+1]++;
                }
            }
        }
        StringBuilder result = new StringBuilder(s);
        int sum =0;
        for(int i=0; i<n; i++){
            sum = (sum+arr[i])%26;
            if(sum<0) sum+=26;
            char shifted = (char) ('a' + ((s.charAt(i)-'a' +sum)%26));
            result.setCharAt(i, shifted);
        }
        return result.toString();

    }
}

// // Approach 2
// class Solution {
//     public String shiftingLetters(String s, int[][] shifts) {
//         int n = s.length();
//         int[] backward = new int[n + 1]; // Prefix array for backward shifts
//         int[] forward = new int[n + 1]; // Prefix array for forward shifts

//         // Populate the prefix arrays based on shifts
//         for (int[] shift : shifts) {
//             int start = shift[0];
//             int end = shift[1];
//             int direction = shift[2];

//             if (direction == 0) {
//                 backward[start]++;
//                 backward[end + 1]--;
//             } else {
//                 forward[start]++;
//                 forward[end + 1]--;
//             }
//         }

//         // Calculate the net backward and forward shifts using prefix sums
//         int[] netShifts = new int[n];
//         int backwardSum = 0, forwardSum = 0;
//         for (int i = 0; i < n; i++) {
//             backwardSum += backward[i];
//             forwardSum += forward[i];
//             netShifts[i] = forwardSum - backwardSum; // Net shift = forward - backward
//         }

//         // Apply the net shifts to the string
//         char[] result = s.toCharArray();
//         for (int i = 0; i < n; i++) {
//             int shift = netShifts[i] % 26; // Modulo 26 for valid shifts
//             if (shift < 0) shift += 26; // Handle negative shifts
//             result[i] = (char) ('a' + (result[i] - 'a' + shift) % 26);
//         }

//         return new String(result);
//     }
// }

