import java.util.*;
public class minandmaxarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i==n-1){
            System.out.println("Minimum is "+arr[0]);
            System.out.println("Maximun is "+arr[n-1]);
            }
            
        }
        sc.close();
    }
}
