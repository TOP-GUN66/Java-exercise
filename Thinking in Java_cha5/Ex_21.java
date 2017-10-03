
public class Ex_21 {
public enum Cash{
	one,five,ten,twenty,fifty
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Cash a:Cash.values()){
			System.out.println(a+",ordinal"+a.ordinal()+"\t");
		}

	}

}
