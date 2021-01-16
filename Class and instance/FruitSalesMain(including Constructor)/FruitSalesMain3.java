class FruitSeller
{
	int numOfApple;
	int myMoney=0;
	final int APPLE_PRICE;

	public FruitSeller(int money, int appleNum, int price)
	{
		myMoney=money;
		numOfApple=appleNum;
		APPLE_PRICE=price;
	}
	public int saleApple(int money)
	{
		int num=money/APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	public void showSaleResult()
	{
		System.out.println("Remain apple : " + numOfApple);
		System.out.println("A margin : " + myMoney);
	}
}

class FruitBuyer
{
	int myMoney;
	int numOfApple;
	
	public FruitBuyer(int money)
	{
		myMoney=money;
		numOfApple=0;
	}
	public void buyApple(FruitSeller seller, int money)
	{
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult()
	{
		System.out.println("Balance : " + myMoney);
		System.out.println("The number of apple : " + numOfApple);
	}
}

class FruitSalesMain3
{
	public static void main(String[] args)
	{
		FruitSeller seller1 = new FruitSeller(0,30,1500);

		FruitSeller seller2 = new FruitSeller(0,20,1000);

		FruitBuyer buyer = new FruitBuyer(10000);
		buyer.buyApple(seller1,4500);
		buyer.buyApple(seller2,2000);

		System.out.println("Present conditions of seller1");
		seller1.showSaleResult();

		System.out.println("Present conditions of seller2");
		seller2.showSaleResult();

		System.out.println("Present conditions of buyer");
		buyer.showBuyResult();

	}
}