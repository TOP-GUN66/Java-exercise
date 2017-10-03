
public class Ex_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test.print();
		System.out.println("Test.s1:"+Test.s1);
		System.out.println("a.s2"+a.s2);
		System.out.println("b.s3"+b.s3);
		

	}
	static Test a= new Test();
	static Test b= new Test();

}
class Test{
	static String s1="hello";
	static String s2,s3;
	static{
		s2="java";
		s3="world";
	}
	Test(){
		System.out.println("Initial~");	
	}
	 static void print(){
		System.out.println("s1:"+s1+"\n"+"s2:"+s2+"\n"+"s3:"+s3);
	}
}
