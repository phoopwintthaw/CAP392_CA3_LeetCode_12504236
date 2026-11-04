// 704. Binary Search 

class Solution {
    public int search(int[] nums, int target) {
        int f_index=0;
        int l_index=nums.length-1;
        int mid; 

        while(f_index <= l_index)
        {
            mid = (f_index + l_index) / 2;

            if(target == nums[mid])
                return mid;
            else if(target < nums[mid])
                l_index = mid - 1;
            else
                f_index = mid + 1;
        }

        return -1;
    }
}
