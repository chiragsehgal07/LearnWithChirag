class Solution {
    public int trap(int[] height) {
        
        // Lmax
        int Lmax[] = new int[height.length];
        Lmax[0] = height[0];
        for(int i =1; i <Lmax.length;i++){
            int temp = Math.max(height[i] , Lmax[i-1]);
            Lmax[i] = temp;
        }
       
        //Rmax 
        int Rmax[] = new int[height.length];
        Rmax[height.length-1] = height[height.length-1];
        for(int i = Rmax.length-2; i >=0;i--){
            int temp = Math.max(height[i] , Rmax[i+1]);
            Rmax[i] = temp;
        }
 
        // formula
        int water =0;
        for(int i =0; i < height.length;i++){
            water += Math.min(Lmax[i], Rmax[i]) - height[i];
        }
        
        return water;
    }
}
