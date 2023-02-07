public class MountainArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 7, 14, 15, 9, 3, 1};
        int ans =peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]) {
                //we are in the decreasing part of the array
                // this can be the anwer but look at left
                end = mid;
            }
            else{
                //we are in asending part of the array
                start = mid + 1;//as we know that mid + 1 elemnt is greater than mid 

            }
            //start and end are always trying to find the max possible value
            //at the end start will be equal to end and that wiil be the max value
        }
        return start;
    }
}
