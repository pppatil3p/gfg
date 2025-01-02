//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] arr, int target) {
        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        
        if (first == -1 || last == -1) {
            return 0; 
        }
        
        return last - first + 1;
    }

    int findFirst(int[] arr, int target) {
        int l = 0, h = arr.length - 1, ans = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == target) {
                ans = mid;
                h = mid - 1; 
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }

    int findLast(int[] arr, int target) {
        int l = 0, h = arr.length - 1, ans = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == target) {
                ans = mid;
                l = mid + 1; 
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }
}

   
