import java.util.Arrays;

public class selectionsort {


    static void sta(int arr[],int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
                }
            //swap
            
            }
            System.out.println(arr[i]);
        }

    }

    static void buble(int arr[],int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
             
        }
        System.out.println("after");
            for(int i = 0;i<n;i++){
                System.out.println(arr[i]+" "); 
       

        }
        
    }

    static void insertionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
             
        }
       




    }
    public static void main(String[] args) {
        int[] arr={2,5,8,9,1,10};
        int n=arr.length;
        sta(arr, n);
        //  insertionsort(arr);
       // buble(arr,n);
    //    System.out.println(Arrays.toString(arr));

        
    }
}



// for(int i=0;i<n-1;i++){
//             for(int j=1;j<=n-i;j++){
//                 if(arr[j-1]>arr[j]){
//                     int temp=arr[j-1];
//                     arr[j-1]=arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }