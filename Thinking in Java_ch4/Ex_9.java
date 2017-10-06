package ch_4;

public class Ex_9 {
	static void Fibonacci(int a){
		long []fib=new long[100];
		fib[0]=1;
		fib[1]=1;
		for(int i=0;i<a;i++){
			if(i<2){
				System.out.println(fib[i]);
			}
			else{
				fib[i]=fib[i-1]+fib[i-2];
				System.out.println(fib[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci(90);
	}

}
