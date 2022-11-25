//  WAP to check if two strings are anagram of each other ?
//  We can say if two strings are an anagram of each other if they contain the same characters but at different orders..

// army & mary

import java.util.*;


public class Anagram {

    public static Boolean checkAnagram(String S1, String S2)
    {
        int m=S1.length();
        int n=S2.length();

        if ( m != n )
            return false;

        char arr1[] = S1.toCharArray();
        Arrays.sort(arr1);
        char arr2[] = S2.toCharArray();
        Arrays.sort(arr2);

        for (int i=0;i<n;i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        String s="army";
        String t="mary";
        System.out.println(checkAnagram(s,t));
    }
}
