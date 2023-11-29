class Solution {
    public void reverse(int [] arr, int low, int high){
        int i = low;
        int j = high;
 
        while(j > i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        // k is greater than array ka size
        k = k%nums.length;
 
        //p1 reverse
        reverse(nums, 0 , nums.length-k-1);
 
        // p2 reverse
        reverse(nums, nums.length-k , nums.length-1);
 
        // combine reverse
        reverse(nums, 0,nums.length-1);
    }
}
