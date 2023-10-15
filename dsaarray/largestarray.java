

import java.lang.reflect.Array;
import java.util.*;

public class largestarray {
    public static void main(String[] args) {
        // int arr[]={10,30,50,60,80};
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length-1]);

        int arr[]={10,30,90,60,80};
        int max=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        

        }
        System.out.println(max);
    }
  
    
}
