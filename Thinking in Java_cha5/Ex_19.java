
public class Ex_19 {
	static void showList(String... args){
		for(String a:args){
			System.out.print(" "+a);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showList("Houston","Chicago","NewYork","Penni","Washington");
		showList(new String[]{"a","b","c","d","e"});

	}

}
