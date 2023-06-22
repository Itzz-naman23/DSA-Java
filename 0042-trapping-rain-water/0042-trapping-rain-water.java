class Solution {
    public int trap(int[] height) {
        
        //left max
        int l[] = new int[height.length];
        l[0]=height[0];

        for(int i=1;i<height.length;i++){
            l[i] = Math.max(height[i],l[i-1]);
        }

        //right max
        int r[] = new int[height.length];

        r[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            r[i]= Math.max(height[i], r[i+1]);
        }

        int trapWater = 0;
        int width = 1;

        for(int i=0;i<height.length;i++){
            int waterLevel = Math.min(l[i], r[i]);

            trapWater += (waterLevel - height[i]) * width;
        }
        return trapWater;
    }
}