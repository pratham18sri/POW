import java.util.*;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int[][] cost=new int[n][k];
        for(int i=0;i<n;i++)
            for(int j=0;j<k;j++)
                cost[i][j]=sc.nextInt();
        int[][] dp=new int[n][k];
        for(int j=0;j<k;j++)
            dp[0][j]=cost[0][j];
        for(int i=1;i<n;i++)
            for(int j=0;j<k;j++){
                dp[i][j]=Integer.MAX_VALUE;
                for(int p=0;p<k;p++)
                    if(p!=j)
                        dp[i][j]=Math.min(dp[i][j],dp[i-1][p]+cost[i][j]);
            }
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<k;j++)
            ans=Math.min(ans,dp[n-1][j]);
        System.out.println(ans);
    
}
