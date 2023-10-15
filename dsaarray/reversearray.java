public class reversearray {
    static void printss(int arr[],int n){  
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }    
    static void reverse(int arr[],int n){
           int p1=0; int p2=n-1;
            while(p1<p2){
           
           int temp=arr[p1];
           arr[p1]=arr[p2];
           arr[p2]=temp;
           p1++;
           p2--;
           
            }
            printss(arr, n);
            
        }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length    ;
        reverse(arr,n);
        
    }
    
}
