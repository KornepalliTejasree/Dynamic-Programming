import java.util.Arrays;

public class HouseRobber {
    public static int robber(int i,int[] heights,int dp[]){
      if(i==0){
        return heights[0];
      }
      if(i<0){
        return 0;
      }
      if(dp[i]!=-1)return dp[i];
      int pick=heights[i]+robber(i-2, heights,dp);
      int nonpick=0+heights[i-1];
      return dp[i]=Math.max(pick,nonpick);
    }
    public static void main(String[] args) {
        int heights[]={2,1,1,2};
        int dp[]=new int[heights.length];
        Arrays.fill(dp, -1);
        
        System.out.println(robber(heights.length-1, heights,dp));
    }
}
// import java.util.Arrays;

// public class HouseRobber {
//     public static int robber(int i,int[] heights,int dp[]){
//       if(i==0){
//         return heights[0];
//       }
//       if(i<0){
//         return 0;
//       }
//       if(dp[i]!=-1)return dp[i];
//       int pick=heights[i]+robber(i-2, heights,dp);
//       int nonpick=0+heights[i-1];
//       return dp[i]=Math.max(pick,nonpick);
//     }
//     public static void main(String[] args) {
//         int heights[]={2,1,1,2};
//         int dp[]=new int[heights.length];
//         Arrays.fill(dp, -1);
        
//         System.out.println(robber(heights.length-1, heights,dp));
//     }
// }
