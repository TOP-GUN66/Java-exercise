package ch_4;

public class Ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status;
		for(int i=1;i<100;i++){
			status=true;
			for(int j=2;j<i;j++){
				if((i%j)==0) {
					status=false;
					break;
				}
			}
			if(status==true) System.out.println(i+"ÊÇËØÊý"+"!");
		}

	}

}
