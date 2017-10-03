
public class Ex_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTest a[]=new ArrayTest[10];
		for (int j=0;j<a.length;j++){
			a[j]=new ArrayTest(Integer.toString(j));
		}

	}

}
class ArrayTest{
	static int i=0;
	ArrayTest(String q){
		System.out.println(q+"i am a constructor"+i);
		i++;
	}
}
