import java.util.Arrays;

public class FrogJumpsKJumps{
    
    public static int Jumps(int[] heights,int idx,int dp[],int K){
     if(idx==0)return 0;
     if(dp[idx]!=-1) return dp[idx];
     int min=Integer.MAX_VALUE;
     for(int k=1;k<=K;k++){
      if(idx-k>=0){
        int jumps=Jumps(heights,idx-k,dp,K)+Math.abs(heights[idx]-heights[idx-k]);
        min=Math.min(min,jumps);
      }
     }
     return dp[idx]=min;
    }
    public static void main(String args[]){
        int[] heights={10, 5, 20, 0, 15};
        int[] dp=new int[heights.length];
        Arrays.fill(dp, -1);
        int K=2;
     System.out.println(Jumps(heights,heights.length-1,dp,K));
    }
}