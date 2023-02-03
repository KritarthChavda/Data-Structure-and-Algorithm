//to print minimum number in an array by using linked list
public class minnumLL {
    public static void main(String[] args) {
        int arr[] = {1 , 4 , 55 , 173 , -3 , 34};
        System.out.println(min(arr));
    }
    static int min(int arr[]){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}
