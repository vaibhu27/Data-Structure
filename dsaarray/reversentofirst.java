public class reversentofirst {
    static void fun(int i,int n ){

         if(i<1) return;
        

          fun(i-1, n);
          System.out.println(i);


     }
    public static void main(String[] args) {
        int n=3;
        fun(n, n);
    }
}
