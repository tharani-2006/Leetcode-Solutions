class Solution {
    public int search(int[] nums, int t) {
        int dec=0;
        if(nums.length==1){
            if(nums[0]==t){
                return 0;
            }else{
                return -1;
            }
        }
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]>nums[l+1]){
                dec=l;
                l=0;
                break;
            }
            l++;
        }

        if(t>=nums[0] && t<=nums[dec]){
            l=0;
            r=dec;
        }
        else{
            l=dec+1;
            r=nums.length-1;
        }

        while(l<=r){
            int mid=l+(r-l)/2;

            if(nums[mid]==t) return mid;
            else if(nums[mid]>t){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;

    }
}