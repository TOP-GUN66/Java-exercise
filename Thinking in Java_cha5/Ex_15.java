
public class Ex_15 {
	String s;
	{
		s="s is initialized";
		System.out.println(s);
	}
	Ex_15(){
		System.out.println("i am an constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ex_15 a= new Ex_15();
        System.out.println("unnamed:\n");
        new Ex_15();
	}

}
