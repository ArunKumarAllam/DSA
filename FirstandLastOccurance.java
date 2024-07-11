import java.util.*;
public class FirstandLastOccurance {
    public static void main(String[] args) {
        int[] nums={-18,12,-4,0,2,3,3,3,3,4,15,16,18,22};
        int target=3;
        int[] ans=searchRange(nums, target) ;
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans={-1,-1};
        //check for first occurance of target
        int start=search(nums, target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;

        return ans;
    }

    //this function just returns the index value of target
   static int search(int[] nums, int target, boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            //find middle element
            int mid=start + (end-start)/2;

            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                //potential ans found
                ans= mid;
                if(findStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            
        }
        return ans;
    }
}
