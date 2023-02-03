import java.util.Scanner;
class kc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  
        for (int i = 2; i <= a; i++) {
            for (int j = 2; j<a/2 ; j++) {
                if (j%i==0){
                }
                else
                System.out.println(j);             
            }
        }
    }
}
