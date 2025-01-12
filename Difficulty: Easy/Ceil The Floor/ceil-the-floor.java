//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findfloor(int[] arr,int x){
          int low=0;
        int n=arr.length;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]<=x){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public int findceil(int[] arr,int x){
          int low=0;
        int n=arr.length;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]>=x){
                ans=mid;
                 high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);

        int floorIndex = findfloor(arr, x);
        int ceilIndex = findceil(arr, x);

        int floorValue = (floorIndex != -1) ? arr[floorIndex] : -1;
        int ceilValue = (ceilIndex != -1) ? arr[ceilIndex] : -1;

        return new int[] {floorValue, ceilValue};
      
    }
}
