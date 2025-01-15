//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
         int pref=1;
        int suf=1;
        int ans=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(pref==0)pref=1;
            if(suf==0)suf=1;
        pref=pref*arr[i];
        suf=suf*=arr[n-i-1];
        ans= Math.max(ans,Math.max(pref,suf));
        }
        return ans;
    }
}