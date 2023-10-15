

import java.util.Scanner;

public class secondsmallest{

    static int secondsmallest(int[] a,int n){
        int smallest=0;
        int ssmallest=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(a[i]<smallest){
                ssmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]!=smallest && a[i] <ssmallest){
                ssmallest=a[i];
            }
        }
         return ssmallest;
    }
   

   



public static void main(String[] args) {
    
    int[] a={3,5,1,6,2,6};
    System.out.println(secondsmallest(a, 6));
}


}