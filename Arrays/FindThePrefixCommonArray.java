class FindThePrefixCommonArray {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        HashSet<Integer> set = new HashSet<>();
        int n=A.length;
        int m = B.length;
        // int i=0, j=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            // Add the current elements from A and B into the set
            if (set.contains(A[i])) {
                count++;
            } else {
                set.add(A[i]);
            }

            if (set.contains(B[i])) {
                count++;
            } else {
                set.add(B[i]);
            }

            // Update the result for the current prefix
            ans[i] = count;
        }
        return ans;
    }
}