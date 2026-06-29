public class ClimbingStairs {
    public static int stairs(int n){
     if(n==0){
        return 1;
     }
     if(n==1){
        return 1;
     }
     int a=stairs(n-1);
     int b=stairs(n-2);
     return a+b;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(stairs(n));
    }
}
