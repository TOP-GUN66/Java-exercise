 enum Cash{
		one,five,ten,twenty,fifty
	}
public class EX_22 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
     Bills a=new Bills(Cash.one),
           b=new Bills(Cash.five),
           c=new Bills(Cash.ten),
           d=new Bills(Cash.twenty),
           e=new Bills(Cash.fifty);
     a.description();
     b.description();
     c.description();
     d.description();
     e.description();
         
         
	}

}
class Bills{
	
	Cash bill;
	void description(){
		System.out.print("the bill is ");
		switch(bill){
		case one:
			System.out.println("one dollar!/$1");
			break;
		case five:
			System.out.println("five dollar!/$5");
			break;
		case ten:
			System.out.println("ten dollar!/%10");
			break;
		case twenty:
			System.out.println("twenty dollar!/$20");
			break;
		case fifty:
			System.out.println("fifty dollar!/$50");
			break;
			
		}
	}
	Bills(Cash bill){
		this.bill=bill;
		
	}
}
