# HackerRankSoln
import java.util.*;

public class Solution {

    // Complete the gridSearch function below.
    static boolean check(int i,int j ,String[] G,String[] P)
    {
        int length=P[0].length();
        
        if(i+P.length<=G.length && j+(length-1)<G[0].length())
            {
                for(int l=i,k=0;l<i+P.length && k<P.length;l++,k++)
                     {
                         HashSet<String> map=new HashSet<String>();
                         map.add(P[k]);
                         String sub=G[l].substring(j,j+length);
                         
                         if(!map.contains(sub))   
                            return false;
                     }
                return true;
            }
            return false;
    }
    static String gridSearch(String[] G, String[] P) {
        char find=P[0].charAt(0);
        for(int i=0;i<G.length;i++)
        {
            String s=G[i];
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==find){
                    if(check(i,j,G,P))
                        return "YES";
                }
            }
        }
        return "NO";
    }
    public static void main(String args[]){
       gridSearch(G,P);//input
    }
}    
