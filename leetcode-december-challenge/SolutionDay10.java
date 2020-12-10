class Solution {
    
    private int findIndex(int[] arr) {
        int maxIndex = 0;
        
        for(int i = 1; i < arr.length; i++)
            if(arr[maxIndex] < arr[i]) maxIndex = i;
        
        return maxIndex;
    } 
    
    private boolean traverseSubset(int[] arr, int l, int r, boolean desc) {
        while(l < r) {
            if(!desc && arr[l] >= arr[l + 1]) return false;
            if(desc && arr[l] <= arr[l + 1]) return false;
            l++;
        }
        return true;
    }
    
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        
        int maxIndex = findIndex(arr);
        
        if(maxIndex == 0 || maxIndex == arr.length - 1) return false;
        
        return traverseSubset(arr, 0, maxIndex - 1, false) && traverseSubset(arr, maxIndex, arr.length - 1, true);
    }
}