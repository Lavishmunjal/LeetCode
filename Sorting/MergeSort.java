class MergeSort {
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 1, 4};
        mergeSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) return; 
        int mid = l + (r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
        
    }
    public static void merge(int arr[], int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int k=l;
        for(int i=0; i<n1; i++){
            left[i] = arr[k];
            k++;
        }
        for(int i=0; i<n2; i++){
            right[i] = arr[k];
            k++;
        }
        int i=0, j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }
        
        
    }
}