import java.util.*;
public class EvenandOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
            else{
                cnt++;
            }
        }
        System.out.println("Even count "+count);
        System.out.println("Odd count "+cnt);
        sc.close();
    }
}
