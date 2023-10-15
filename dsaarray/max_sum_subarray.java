//public class max_sum_subarray {
//     static void sumarray(int arr[],int n){
//         int sum=0;
//         int maxi=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++)
//         {
//             sum+=arr[i];
//             if(sum>maxi)
//             {
//                 maxi=sum;
//             }
//             if(sum<0)
//             {
//                 sum=0;
//             }
//         }
//         System.out.println(maxi);
//
//     }
//
//    public static void main(String[] args) {
//        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int n = arr.length;
//        sumarray(arr,n);
//    }
//}

//---------------------------------------------------------------------------------------------------------

public class max_sum_subarray {
    static  long sumarray(int arr[], int n) {

        long maxi=Long.MIN_VALUE;
        long sum=0;
        int start=0;
        int arrstart=-1,arrend=-1;

        for(int i=0;i<n;i++) {

            if (sum == 0) start = i;
            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
                arrstart = start;
                arrend = i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("The array is:");
        for (int i=arrstart;i<arrend;i++){
            System.out.print(arr[i]+" ");
        }
        return maxi;

    }

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxiarr=sumarray(arr,n);
        System.out.println(maxiarr);
    }
    }
