//{ Driver Code Starts
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine(); // Use lowercase 's'

            Solution ob = new Solution();
            if (ob.isPalindrome(s)) // Check palindrome
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean isAN(char ch){
        if((ch>='0' && ch<='9')||(Character.toLowerCase(ch)>='a'&& Character.toLowerCase(ch)<='z')){
            return true;
        }
        return false;
    }
    boolean isPalindrome(String s) {
        int st=0 ;
        int n=s.length();
        int end=n-1;
        
        while(st<end){
            if(! isAN(s.charAt(st))){
                st++; continue;
            }
            if(!isAN(s.charAt(end))){
                end--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(st))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }
            st++; end--;

        }
        return true;
    }
};