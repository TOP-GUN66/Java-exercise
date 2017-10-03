
public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank1=new Tank(2);
		Tank tank2=new Tank(6);
		Tank tank3=new Tank();
		System.out.println("tank1:"+tank1.tankStatus());
		System.out.println("tank2:"+tank2.tankStatus());
		System.out.println("tank3:"+tank3.tankStatus());
		tank1.emptyTank();
		tank2.emptyTank();
		new Tank(4);
		System.gc();
		System.runFinalizersOnExit(true);
		System.out.println("after runFinalizerOnExit,gc");
		System.gc();
	}

}
class Tank{
	public int height;
	Tank(int a){
		height=a;
	}
	Tank(){
		this(0);
	}
	void emptyTank(){
		height=0;
	}
	int tankStatus(){
		return height;
	}
	protected void finalize(){
		if(height!=0){
			System.out.println("it is not empyt!");
		}
	}
	
}
