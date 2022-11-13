import java.util.*;

public class NucleusSoft {
    public static void fun(int N){
        int A=0,res=0,ans=0;
       
        for(int i=0;i<=100;i++){
            if (i % N == 0 && i != N) {
                ans = i;
            }
            while (ans > 0) {
                    A = ans % 10;
                    res = res + A;
                    ans = ans / 10;
                }
            if(res==N)
                    System.out.println(i);
            break;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        fun(input1);
    }
}
