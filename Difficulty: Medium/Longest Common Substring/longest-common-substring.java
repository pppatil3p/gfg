//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
       int n = s1.length();
        int m = s2.length();
        
        int[] prev = new int[m + 1]; 
        int[] curr = new int[m + 1];  
        
        int maxLength = 0;  
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    curr[j] = prev[j - 1] + 1;  
                    maxLength = Math.max(maxLength, curr[j]);
                } else {
                    curr[j] = 0;  
                }
            }
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }
        
        return maxLength;
    }
}