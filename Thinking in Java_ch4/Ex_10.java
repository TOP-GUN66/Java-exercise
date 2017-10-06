package ch_4;

public class Ex_10 {
	static int combine(int val1,int val2){
		return val1*10+val2;
	}
    static void test(int m,int n,int target){
    	if(m*n==target){
    		System.out.println(m+"*"+n+"="+target);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i ;
		for(i=1000;i<10000;i++)
		{
			//分开各个数字
			int a=i/1000;//千位
			int b=(i-a*1000)/100;//百位
			int c=(i-a*1000-b*100)/10;//十位
			int d=(i-a*1000-b*100-c*10);//个位
			test(combine(a,b),combine(c,d),i);
			test(combine(a,b),combine(d,c),i);
			test(combine(a,c),combine(b,d),i);
			test(combine(a,c),combine(d,b),i);
			test(combine(a,d),combine(b,c),i);
			test(combine(a,d),combine(c,b),i);
			test(combine(b,a),combine(c,d),i);
			test(combine(b,a),combine(d,c),i);
			test(combine(b,c),combine(d,a),i);
			test(combine(b,d),combine(c,a),i);
			test(combine(c,a),combine(d,b),i);
			test(combine(c,b),combine(d,a),i);
		 
			
			
		}
       
	}

}
