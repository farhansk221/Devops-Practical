public class Fib {
    public static void main(String[] args) {
      
    int n=20;
    int fib[] = new int[n];
    fib[0]=0;
    fib[1]=1;
    for(int i=2;i<n;i++) {
    	fib[i]=fib[i-1]+fib[i-2];
    }
    System.out.print("The first 20 Fibonacci numbers are: ");
    for(int i=0;i<n;i++) {
    	System.out.print(fib[i]+" ");
    }
    }
}
