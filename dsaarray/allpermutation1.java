import java.util.ArrayList;
import java.util.List;
public class allpermutation1 {
    private static void per(List<Integer> ds,int[] num,boolean[] freq,List<List<Integer>> ans ){
            if(ds.size()==num.length){
                ans.add(new ArrayList<>(ds));
                return;
            }
            for(int i=0;i<num.length;i++){
                if(!freq[i]){
                    freq[i]=true;
                    ds.add(num[i]);
                    per(ds, num, freq, ans);
                    ds.remove(ds.size()-1);
                    freq[i]=false;
                }
            }        }
    private static List<List<Integer>> allper(int[] arr){
            List<List<Integer>> ans=new ArrayList<>();
            List<Integer> list=new ArrayList<>();
            boolean[] freq=new boolean[arr.length];
        per(list,arr,freq,ans);
        return ans; 
    }
     
    
    
    
    public static void main(String[] args) {
            int [] arr={1,2,3};

            System.out.println(allper(arr));
    }

}
