class Solution {
    
    static int solver(String s1, String s2,int i ,int j,int dp[][]) {
        if(i>=s1.length() || j >=s2.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        if(s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = 1+solver(s1,s2,i+1,j+1,dp);
        }
        else {
            return dp[i][j] = Math.max(solver(s1,s2,i+1,j,dp) , solver(s1,s2,i,j+1,dp));
        }
    }
    
    static int lcs(int n, int m, String s1, String s2) {
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                dp[i][j]=-1;
        
        return solver(s1,s2,0,0,dp);
    }
}