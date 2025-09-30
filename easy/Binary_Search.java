class Solution {
    public int search(int[] nums, int t) {
        int l=0;
        int r=nums.length-1;
        int mid = l + (r-l)/2;
        while(l<=r){

            mid = l + (r-l)/2;
            
            if(nums[mid] == t) return mid;

            else if(t >nums[mid]) {
                l= mid+1;
            }
            else {
                r=mid-1; 
            }
           
        }
         return -1;
        
    }
}