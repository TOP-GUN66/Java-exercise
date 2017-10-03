
public class Ex_8 {
	public void print1(){
		System.out.println("Function 1");
		print2();
		this.print2();
	}

	private void print2() {
		// TODO Auto-generated method stub
		System.out.println("Function 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex_8 a =new Ex_8();
		a.print1();

	}

}
