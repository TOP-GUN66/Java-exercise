
public class Ex_9 {
	Ex_9(String s){
		System.out.println("this is constructor 1"+s);
	}
	Ex_9(){
		this(" this is constructor 2");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex_9 a = new Ex_9();

	}

}
