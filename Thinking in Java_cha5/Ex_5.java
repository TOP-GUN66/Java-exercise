
public class Ex_5 {
public void bark(char c){
	System.out.println("barking~");
}
public void bark(short c){
	System.out.println("howling~");
}
public void bark(long a){
	System.out.println("wangwang~");
}
public void bark(int a){
	System.out.println("ahah~");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char a='A';
       long b=100;
       Ex_5 c= new Ex_5();
       c.bark(a);
       c.bark(b);
       c.bark((int)b);
       c.bark((short)b);
       
	}

}
