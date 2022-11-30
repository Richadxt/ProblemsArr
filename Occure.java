// FIND THE OCCURRENCE OF An integer in the array


public class Occure {
    public static  int occRe(int arr[],int N){
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==N){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args){
        int arr[]={2,67,34,1,89,67,56,67};
        int N=67;
        System.out.println(occRe(arr,N));
    }
}
