import java.util.*;
public class SumandAverageArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        double average = sum/2;
        int mean = sum/n;
        Arrays.sort(arr);
        float  median = 0;
        if(n%2==0){
            median += (arr[n/2-1] + arr[n/2])/2.0;
        }else{
            median += arr[n/2];
        }


        System.out.println(sum);
        System.out.println(average);
        System.out.println(mean);
       System.out.println(median);
        sc.close();
    }
}
