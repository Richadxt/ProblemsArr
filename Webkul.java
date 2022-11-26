import java.util.*;

public class Webkul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun1(n);
    }
    public static void fun1(int n){
        for(int i=0;i<n-1;i++){
            System.out.print("e");
            for(int j=0;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("@");
            }
            System.out.println(" ");
        }
        for(int p=0;p<=n+1;p++){
            System.out.print("e");
        }
        for(int r=0;r<n;r++){
            System.out.print("@");
        }
    }
}
