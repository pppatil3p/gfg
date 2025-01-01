//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // consume the newline
            String input = sc.nextLine();
            String[] strNumbers = input.split(" ");
            int[] arr = new int[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                arr[i] = Integer.parseInt(strNumbers[i]);
            }
            Solution ob = new Solution();
            int res = ob.binarysearch(arr, k);
            System.out.println(res);

            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int binarysearch(int[] arr, int k) {
        int l=0;
        int h = arr.length-1;
        int result=-1;
        while(l<=h){
            int mid= l+(h-l)/2;
            
            if(arr[mid]==k){
                result=mid;
                h=mid-1;
                
            }
            else if(arr[mid]<k){
            
                l=mid+1;
            }
            else{
            
                h=mid-1;
            }
            
            
            
        }
            return result;
        
    }
}