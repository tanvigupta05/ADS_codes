// Smallest substring in first string that contains all the character of s2.
import java.util.*;
public class smallestSubstring{
    public static void main(String[] args){
        // use 2 hashmaps
        //charFreq: to store freq of each character in s2
        // sec- windowCount: to store the frequency of characters in the current window of size s1
        // use two poiners - start end to denote current window 
        // expand the window by moving the end pointer until all characters in s2 are covered.
        // once a valid window is found, shrink it from left by moving start pointer forward to minimize the window.
    }
    public static String substring(String s1,String s2){
        if(s1==null || s2==null || s1.length()<s2.length()){
            return "";
        }
        HashMap<Character,Integer> charfreq= new HashMap<>();
        for(char c:s2.toCharArray()){
            charfreq.put(c,charfreq.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer>windowcount= new HashMap<>();
        int start =0, matched=0,minLeng=Integer.MAX_VALUE;
        int minstart=0;
        for(int end=0;end<s1.length();end++){
            char endChar= s1.charAt(end);
            windowcount.put(endChar,windowcount.getOrDefault(endChar,0)+1);
            if(charfreq.containsKey(endChar) && windowcount.get(endChar).equals(charfreq.get(endChar))){
                matched++;
            }
            while(matched==charfreq.size()){
                if(end-start+1<minLeng){
                    minLeng=end-start+1;
                    minstart=start;
                }
                char startChar= s1.charAt(start);
                windowcount.put(startChar,windowcount.get(startChar)-1);
                if(charfreq.containsKey(startChar)&& windowcount.get(startChar)<charfreq.get(startChar)){
                    matched--;
                }
                start++;
            }
        }
        return minLeng==Integer.MAX_VALUE ?"":s1.substring(minstart,minstart+minLeng);
    }
}