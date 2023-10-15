

import java.util.ArrayList;
import java.util.List;

public class dupliarray {
    public static void main(String[] args) {
        
    List<Integer> list=new ArrayList<>();
    int[] arr={10,10,20,20,30,40};
        int j;
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }


System.out.println(list);
    }
    
}
