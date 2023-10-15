import java.util.Scanner;

public class backtrackingnto1 {
    
     static void fun(int i,int n){

        if(i>n) return;

        fun(i+1, n);
         System.out.println();


     }
     public static void main(String[] args) {
        int n=4;
        fun(1, n);
     }
}
