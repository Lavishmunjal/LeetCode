class QuickSort {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low>=high) return;
        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);
        
    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int pivot = arr[high];
        int pi = low;
        for(int i=low; i<high; i++){
            if(arr[i]<=pivot){
                swap(arr, i, pi);
                pi++;
                
            }
            
        }
        swap(arr, pi, high);

        return pi;
    }
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}