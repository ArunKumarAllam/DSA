public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println(findPivotPosition(arr)+1);
    }
    // works if no duplicate
    static int findPivotPosition(int[] nums){
        int start=0, end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end &&nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
