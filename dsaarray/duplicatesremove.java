

public class duplicatesremove {
    public static void main(String[] args) {
        int[] arr={10,10,20,20,30,40};
        int i=0;
        int j;
        for(j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }

        }
        System.out.println(i+1);
    }
}
