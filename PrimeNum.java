import java.util.*;

public class PrimeNum {
    static void isPrime(int n) {
        if (n == 1) return ;
        if (n == 2 || n == 3)
            System.out.print(n + " ");
        if(n % 2 == 0 || n % 3 == 0) return ;
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0) return ;
        System.out.print(n + " ");
    }
    public static void main(String[] args){
        int n=1000;
        for(int i=0;i<=n;i++) {
            isPrime(i);
        }
    }
}
