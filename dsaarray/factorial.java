public class factorial {
    
    static void fact(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum=sum*i;
                 
    }
     System.out.println(sum);  
}
    public static void main(String[] args) {
        int n=5;
        fact(n);
    }
}

