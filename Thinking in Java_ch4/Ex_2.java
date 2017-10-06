package ch_4;

import java.util.Random;

public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[25];
		Random rand = new Random();
		for(int i=0;i<a.length;i++){
			int x=rand.nextInt(10);
			a[i]=x;
		}
		for(int j=0;j<a.length-1;j++){
			int lval=a[j];
			int rval=a[j+1];
			if(lval<rval) System.out.println(lval+"<"+rval);
			else if(lval>rval) System.out.println(lval+">"+rval);
			else System.out.println(lval+"="+rval);
		}
	}
}


