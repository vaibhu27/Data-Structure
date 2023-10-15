

public class secondlargest {
    public static void main(String[] args) {
        int arr[]={10,30,90,60,80};
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int secondlar=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>secondlar && arr[i]!=max ){
                secondlar=arr[i];
            }
        }
        System.out.println(secondlar);
    }
}
