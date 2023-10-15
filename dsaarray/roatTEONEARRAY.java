public class roatTEONEARRAY {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int temp=arr[0];
        int i;

        for( i=1;i<arr.length-1;i++){
            arr[i-1]=arr[i];
        }
        arr[(arr.length-1)-1]=temp;
        System.out.println("The array is"+arr[i]);
    }
}
