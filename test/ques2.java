//Given two strings s and t, return the smallest substring of s that contains all characters of t. If no such substring exists, return ""

import java.util.HashMap;

public class ques2 {
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

    public static void main(String[] args) {
        String s="hello";
        String t= "helli";

        System.out.println(substring(s, t));
    }
}

