
public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book(true);
		Book book2=new Book(true);
		book1.logOut();
		book2.logOut();
		new Book(true);
		System.gc();

	}

}
class Book{
	boolean login=false;
	Book(boolean a){
		login=a;
	}
	void logIn(){
		login=true;
	}
	void logOut(){
		login=false;
	}
	protected void finalize(){
		if(login){
			System.out.println("Still log¨ªn!");
		}
		try {
			super.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
