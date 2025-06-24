import java.util.*;
public class reversearray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] b = new int[n];
        for(int i=n-1;i>=0;i--){
            b[i] = a[i];
            System.out.print(b[i]+" ");

        }
       sc.close();
    }
}
