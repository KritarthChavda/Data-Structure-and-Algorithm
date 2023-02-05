public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { -22, -12, -7, -5, -1, 0, 12,15, 66 ,77, 283};
        int target = 12;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
    static int binarysearch(int arr[] , int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= target){
            int mid = start + (end - start)/2;
            //this above state ment is = to (start + end)/2 but in this case 
            //it is possible that it might increase the integer limit
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
