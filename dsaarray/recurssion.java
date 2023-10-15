class Recursion {
    
    static void func(int i, int n){
      
            if(i>n) return;
            System.out.println(i);

            func(i+1,n);

    }
    public static void main(String[] args) {
     
       func(1, 6);
       
    }
}