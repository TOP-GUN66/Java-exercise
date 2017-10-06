package ch_4;
import java.util.Random;

public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand1=new Random();
		Random rand2=new Random();
		while(true){
			int x=rand1.nextInt(100);
			int y =rand2.nextInt(100);
			if(x<y) System.out.println(x+"<"+y);
			else if(x>y) System.out.println(x+">"+y);
			else System.out.println(x+"="+y);
		}

	}

}
