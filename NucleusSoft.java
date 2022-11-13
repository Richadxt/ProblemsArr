import java.util.*;

public class NucleusSoft {
    public static void fun(int N){
        int A=0,res=0,ans=0;
        int i=1;
        while(i<=1000){
            if (i % N == 0 && i != N) {
                ans = i;
            }
            while (ans > 0) {
                    A = ans % 10;
                    res = res + A;
                    ans = ans / 10;
                }
            if(res!=N)
                i++;
            else
                    System.out.println(i);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        fun(input1);
    }
}
