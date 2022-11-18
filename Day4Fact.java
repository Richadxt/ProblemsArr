//FIND THE FACTORIAL OF A LARGE NUMBER

import java.util.ArrayList;

public class Day4Fact {
    static ArrayList<Integer> factorial(int n){
        ArrayList<Integer> result=new ArrayList<Integer>();
        int size=0,carry=0;
//        adding 1 at 0th index
        result.add(0,1);
//        updating size
          size=1;
//        Declare a variable to traverse number from 2 to n
          int val=2;
          while(val<=n){
//              Traverse arrayList from right to left
              for(int i=size-1;i>=0;i--){
//                  Update value in arraylist
                  int temp=result.get(i)*val + carry;
//                  store the last digit at index and add remaining to carry
                  result.set(i,temp%10);
//                  update carry
                  carry=temp/10;
              }
//              insert carry digit by digit to the beginning of the arraylist
              while(carry!=0){
                  result.add(0,carry%10);
                  carry=carry/10;
                  size++;
              }
              val++;
          }
          return result;
    }
    public static void main(String args[])
    {
       System.out.println(factorial(100));
    }
}
