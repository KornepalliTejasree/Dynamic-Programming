import java.util.Arrays;

public class FrogJump {
    // public static int minimumJumps(int n,int[] heights,int idx,int sum){
    //  if(idx==n-1){
    //     return sum;
    //  }
    //  int min=Integer.MAX_VALUE;
    //  int a=Integer.MAX_VALUE;
    //  int b=Integer.MAX_VALUE;
    //  if(idx+1<n  ){
    //  a=Math.abs(heights[idx]-heights[idx+1]);
    //  }
    //  if(idx+2<n){
    //  b=Math.abs(heights[idx]-heights[idx+2]);
    //  }
    //   min=Math.min(a, b);
    // sum+=min;
    // if(idx+2<n && min==Math.abs(heights[idx]-heights[idx+2])){
    //    return minimumJumps(n, heights, idx+2, sum);
    // }
    // else{
    //   return  minimumJumps(n, heights, idx+1, sum);
    // }
    // }
    public static void main(String[] args) {
        int n=5;
        int[] heights={7,5,1,2,6};
        int[] dp=new int[n];
        Arrays.fill(dp, -1);
      //   minimumJumps(n, heights, 0, 0, dp);
      //  System.out.println(dp[n-1]);
      System.out.println(dpApproach(n-1, heights, dp));
    }

    private static void minimumJumps(int n, int[] heights, int i, int sum,int[] dp) {
      if(i==n-1){
        dp[i]=Math.min(dp[i], sum);
        return;
      }
      if(i+1<n){
        int temp=Math.abs(heights[i]-heights[i+1]);
        minimumJumps(n, heights, i+1, sum+temp, dp);
       
      }
      if(i+2<n){
        int temp=Math.abs(heights[i]-heights[i+2]);
        minimumJumps(n, heights, i+2, sum+temp, dp);
        
      }
    }
    public static int dpApproach(int idx,int[] heights,int[] dp){
      if(idx==0){
        return 0;
      }
      if(dp[idx]!=-1){
        return dp[idx];
      }
      int left=Math.abs(heights[idx]-heights[idx-1])+dpApproach(idx-1, heights, dp);
      int right=Integer.MAX_VALUE;
      if(idx>1){
        right=Math.abs(heights[idx]-heights[idx-2])+dpApproach(idx-2, heights, dp);
      }
      return dp[idx]=Math.min(left, right);
    } 
}
