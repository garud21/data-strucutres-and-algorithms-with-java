import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Data Structures And Algorithms !!!!");
        /* recursion basics */
        /*calcuatig the power of a number without recursion*/
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        a=sc.nextInt();
        System.out.println("enter the power : ");
        b=sc.nextInt();
        int i=0;
        long j=1;
        for(i=0;i<b;i++){
            j=j*a;}
        System.out.println(j);
        System.out.println();
        System.out.println("using recursion");
       double o= power(a,b);
        System.out.println(o);
    }
    public static double power(int a,int b){
        if (a>1){
            return (a*Math.pow(a,b-1));
        }
        else return 1;
    }

}