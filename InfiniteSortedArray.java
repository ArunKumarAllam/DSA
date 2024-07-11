public class InfiniteSortedArray {
    public static void main(String[] args){
        int[] arr={0,2,3,4,15,16,18,22,23,24,26,30,33,37,39,42,46,47,48,50,55,57,60,65,66,67,68,69,70,71,72};
        int target=48;
        System.out.println(ansRange(arr, target));
    }

    static int ansRange(int[] arr, int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch (int[] arr, int target, int start, int end){
        
        while(start<=end){
            //find middle element
            int mid=start + (end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //ans found
                return mid;
            }
            
        }
        return -1;
    }
}
