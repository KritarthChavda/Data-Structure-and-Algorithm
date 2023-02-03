public class linearsearch {
    public static void main(String[] args) {
        int[] num = { 1 , 22  , 33 , -54 , 532 , 6 , 12};
        int target = 12;
        int ans = linearsearch(num,target);
        System.out.println(ans);
    }
    static int linearsearch(int arr[] , int target) {
        if (arr.length == 0){
            return -1;//if array does not exist
        }
        for (int index = 0; index < arr.length; index++) {
            //now we will check for every element if it is equal to target or not 
            int element = arr[index];
            if(element == target){
                return index;
            }

        }
        //this statement will execute if none of the return statement fulfilled the condition
        return -1;
    }
}

