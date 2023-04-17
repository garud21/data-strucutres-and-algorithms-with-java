import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Welcome to Data Structures And Algorithms !!!!");
        System.out.println("fibonacci without recursions");
        int first =0,second=1,third;
        System.out.println(""+first);
        System.out.println(second);
        for (int i=first;i<5
                ;i++){
            third=first+second;
            first=second;
            second=third;
            System.out.println(third);
        }
        System.out.println("using recursion : ");
        System.out.println("enter number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fibo(a));

    }
    public static int fibo(int n){
        if (n<=1){
            return n;
        }else {
            return fibo(n-1)+fibo(n-1);
        }


    }

}

