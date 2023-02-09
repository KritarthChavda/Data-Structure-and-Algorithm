import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int arr[]){
        boolean swapping = false;
        //this will run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            //now for each step the max number will come at last
            for (int j = 1; j < arr.length-i ; j++) {
                //swap if the number is smaller than the previous number
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapping = true; 
                }
            }
            if(!swapping){
                break;
            }
        }
    }
}
