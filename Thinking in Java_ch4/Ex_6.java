package ch_4;

public class Ex_6 {
static int test(int testval,int target,int begin,int end){
		if((testval<target)&&(testval>=begin)&&(testval<=end))
			return -1;
		if((testval>target)&&(testval>=begin)&&(testval<=end))
			return +1;
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(test(11,12,1,13));
		System.out.println(test(14,10,2,16));
		System.out.println(test(16,12,1,15));
		

	}

}
