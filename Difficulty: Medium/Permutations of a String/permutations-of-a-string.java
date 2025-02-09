//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            ArrayList<String> ans = obj.findPermutation(S);
            Collections.sort(ans);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public ArrayList<String> findPermutation(String s) {
            ArrayList<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars); 
        boolean[] used = new boolean[s.length()];
        backtrack(result, new StringBuilder(), chars, used);
        return result;
    }
    
    private void backtrack(ArrayList<String> result, StringBuilder temp, char[] chars, boolean[] used) {
        if (temp.length() == chars.length) {
            result.add(temp.toString());
            return;
        }
        
        for (int i = 0; i < chars.length; i++) {
            if (used[i] || (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])) {
                continue;
            }
            
            used[i] = true;
            temp.append(chars[i]);
            backtrack(result, temp, chars, used);
            temp.deleteCharAt(temp.length() - 1);
            used[i] = false;
        }
    }
}