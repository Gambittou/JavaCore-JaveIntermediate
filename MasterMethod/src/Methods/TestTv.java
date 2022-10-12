package Methods;

public class TestTv {
	
	public static void main(String[] args) {
		Television tele=new Television();
		tele.brand="Nokia";
		tele.price=1200;
		tele.screenSize=55;
		tele.turnOn();
		int x=tele.switchToAChannel();
		System.out.println(x);
		System.out.printin(tele.switchToAChannel());
		
		double discount=tele.getDiscount();
		System.out.println(discount);
		
		double discountOnBF=tele.discountOnBlackFriday(30);
		System.out.println(discountOnBF);
		
		double discount=tele.discountOnBlackFriday(50);
		System.out.printin(discountAtTheEnd);
		
		double totalDiscount=tele.dicountWithCityBank(30, 25);
        System.out.println(totalDiscount);
	}

}
