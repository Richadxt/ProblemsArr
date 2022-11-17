// REARRANGE THE ARRAY IN ALTERNATING POSITIVE AND NEGATIVE ITEMS

public class Day3Third {
    public static void rearrangeArray(int[] a) {
        int[] res=new int[a.length];
        int fIdx=0;
        int lIdx=1;

        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                res[fIdx]=a[i];
                fIdx+=2;
            }
            else{
                res[lIdx]=a[i];
                lIdx+=2;
            }
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
    public static void main(String[] args){
        int[] arr={3, -9, -8, 5, 4, -7};
        rearrangeArray(arr);
    }
}
