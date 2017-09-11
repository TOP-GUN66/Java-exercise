package ex_ch3;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sim={1,4,3,6,23,78,90};
		//Ã°ÅÝÅÅÐò
		int i=sim.length;
		int flag=0;
		int temp;
		while(i>1){
			for(int j=0;j<i-1;j++){
				if(sim[j]>sim[j+1]){
					temp=sim[j];
					sim[j]=sim[j+1];
					sim[j+1]=temp;
					flag=j;
				}
				
			}
			i=flag;
		}
		System.out.println(Arrays.toString(sim));
        
	}
	

}
