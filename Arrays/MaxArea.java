public class MaxArea {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0, j=n-1;
        int result=0;
        while(i<j){
            int width = j-i;
            int h = Math.min(height[i], height[j]);
            int area = width*h;
            result = Math.max(result, area);
            if(height[i]>height[j]){
                j--;
            }else {
                i++;
            }
        }
        return result;
    }
}
