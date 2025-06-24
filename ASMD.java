import java.util.*;
public class ASMD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int A = a+b;
        int S = a-b;
        int M = a*b;
        int D = a/b;
        System.out.println(A);
        System.out.println(S);
        System.out.println(M);
        System.out.println(D);
        sc.close();
    }
}